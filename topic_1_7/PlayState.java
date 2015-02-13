package topic_1_7;

public class PlayState implements TrackState {

	@Override
	public void playTrack(TrackContext trackContext) {
		trackContext.setTrackState(new PauseState());
		System.out.println("The track " + trackContext.getName() + " has paused.");
	}

	@Override
	public void pauseTrack(TrackContext trackContext) {
		trackContext.setTrackState(new PauseState());
		System.out.println("The track " + trackContext.getName() + " has paused.");
	}

	@Override
	public void stopTrack(TrackContext trackContext) {
		trackContext.setTrackState(new StopState());
		System.out.println("The track " + trackContext.getName() + " has stopped.");
	}
	
}
