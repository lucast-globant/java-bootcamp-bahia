package topic_1_7;

public class PauseState implements TrackState {
	
	@Override
	public void playTrack(TrackContext trackContext) {
		trackContext.setTrackState(new PlayState());
		System.out.println("The track " + trackContext.getName() + " is now playing.");
	}

	@Override
	public void pauseTrack(TrackContext trackContext) {
		trackContext.setTrackState(new PlayState());
		System.out.println("The track " + trackContext.getName() + " is now playing.");
	}

	@Override
	public void stopTrack(TrackContext trackContext) {
		trackContext.setTrackState(new StopState());
		System.out.println("The track " + trackContext.getName() + " has stopped.");
	}

}
