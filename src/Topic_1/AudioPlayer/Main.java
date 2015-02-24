package Topic_1.AudioPlayer;

import Topic_1.AudioPlayer.AudioPlayers.IAudioPlayer;
import Topic_1.AudioPlayer.AudioPlayers.MyAudioPlayer;

public class Main {
	public static void main(String args[]) {

		// Set track
		Track track = new Track("test.mp3");

		// Create audio player
		IAudioPlayer audioPlayer = new MyAudioPlayer();

		// Start playing
		System.out.println("Command: Play");
		audioPlayer.play();

		// Load song
		System.out.println("Command: Load");
		audioPlayer.load(track);

		// Play song
		System.out.println("Command: Play");
		audioPlayer.play();

		// Play again
		System.out.println("Command: Play");
		audioPlayer.play();

		// Pause playing
		System.out.println("Command: Pause");
		audioPlayer.pause();

		// Play again => does nothing
		System.out.println("Command: Play");
		audioPlayer.play();

		// Stop playing
		System.out.println("Command: Stop");
		audioPlayer.stop();

		// Pause in stopped state
		System.out.println("Command: Pause");
		audioPlayer.pause();
	}
}
