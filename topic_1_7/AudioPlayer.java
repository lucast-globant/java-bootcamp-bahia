package topic_1_7;

import java.util.ArrayList;

public class AudioPlayer {
	
	private ArrayList<Track> trackList;
	private Track actualTrack;
	
	public AudioPlayer() {
		trackList = new ArrayList<Track>();
	}
	
	public void addTrack (Track track) {
		trackList.add(track);
	}
	
	public void playTrack () {
		if (actualTrack != null) {
			TrackContext trackContext = actualTrack.getTrackContext();
			trackContext.playTrack(trackContext);
		}
	}
	
	public void pauseTrack () {
		if (actualTrack != null) {
			TrackContext trackContext = actualTrack.getTrackContext();
			trackContext.pauseTrack(trackContext);
		}
	}
	
	public void stopTrack () {
		if (actualTrack != null) {
			TrackContext trackContext = actualTrack.getTrackContext();
			trackContext.stopTrack(trackContext);
		}
	}
	
	public void selectTrack (Track track) {
		actualTrack = track;
	}
	
}