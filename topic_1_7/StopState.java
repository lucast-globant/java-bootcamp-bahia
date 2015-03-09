package topic_1_7;

public class StopState implements TrackState {
	
	@Override
	public void playTrack(TrackContext trackContext) {
		trackContext.setTrackState(new PlayState());
		System.out.println("The track " + trackContext.getName() + " is now playing.");
	}

	@Override
	public void pauseTrack(TrackContext trackContext) {
		System.out.println("The track " + trackContext.getName() + " is stopped.");
	}

	@Override
	public void stopTrack(TrackContext trackContext) {
		System.out.println("The track " + trackContext.getName() + " is stopped.");
	}

}
