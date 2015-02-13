package Topic1.key7;

import java.util.List;


/**
 * @author Jordan
 * adapter class
 */
public class AudioPlayer  extends MediaAdaptee implements MediaPlayer {
	
	private MediaAdaptee adapter;
	private List<Track> reproductionList;
	private Track actualTrack;
	
	public AudioPlayer(){
		adapter=new MediaAdaptee();
	}

	
	public void pause() {
		adapter.pause();
	}
	
	public  void play() {
		adapter.play();
	}
	
	public  void stop() {
		adapter.stop();
	}
	
	public List<Track> getReproductionList() {
		return reproductionList;
	}

	public void setReproductionList(List<Track> reproductionList) {
		this.reproductionList = reproductionList;
	}

	public Track getActualTrack() {
		return actualTrack;
	}

	public void setActualTrack(Track actualTrack) {
		this.actualTrack = actualTrack;
	}
	

}
