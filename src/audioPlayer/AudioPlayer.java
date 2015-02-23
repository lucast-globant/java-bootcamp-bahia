package audioPlayer;

import java.util.ArrayList;
import java.util.List;

public class AudioPlayer {
	private States state;
	private int actualSong;
	private List<Song> songList;

	public AudioPlayer() {
		songList = new ArrayList<Song>();
		actualSong = 1;
		state = States.STOPPED;
	}

	public void addSong(Song song) {
		songList.add(song);
	}

	/*
	 * Each of these methods return 'true' if the operation was successful, or
	 * 'false', if it was not possible to complete the action due to an
	 * incompatible state
	 */

	// If the audio player is already playing a song or there are no songs in
	// the list, it ignores the request and returns false.
	// Otherwise, it starts playing the actual song.
	public boolean play() {
		if (songList.size() == 0 || state.equals(States.PLAYING)) {
			return false;
		} else {
			state = States.PLAYING;
			return true;
		}
	}

	public boolean stop() {
		if (state.equals(States.STOPPED)) {
			return false;
		} else {
			state = States.STOPPED;
			return true;
		}
	}

	public boolean pause() {
		if (state.equals(States.STOPPED) || state.equals(States.PAUSED)) {
			return false;
		} else {
			state = States.PAUSED;
			return true;
		}
	}

	public boolean back() {
		if (actualSong == 1) {
			return false;
		} else {
			actualSong--;
			if (state.equals(States.PAUSED)) {
				state = States.STOPPED;
			}
			return true;
		}
	}

	public boolean forward() {
		if (actualSong == (songList.size() -1)) {
			return false;
		} else {
			actualSong++;
			if (state.equals(States.PAUSED)) {
				state = States.STOPPED;
			}
			return true;
		}
	}
}
