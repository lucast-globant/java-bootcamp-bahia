package topic_1_7;

public class TrackContext implements TrackState {
	
	private TrackState trackState;
	private String name;

	public TrackContext (String name) {
		this.name = name;
		this.trackState = new StopState();
	}
	
	public String getName() {
		return name;
	}
	
	public void setTrackState (TrackState trackState) {
 		this.trackState = trackState;
 	}

	@Override
	public void playTrack(TrackContext trackContext) {
		trackState.playTrack(this);		
	}

	@Override
	public void pauseTrack(TrackContext trackContext) {
		trackState.pauseTrack(this);		
	}

	@Override
	public void stopTrack(TrackContext trackContext) {
		trackState.stopTrack(this);		
	}
}