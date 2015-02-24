package Topic_1.AudioPlayer.PlayerStates;

import Topic_1.AudioPlayer.AudioPlayers.IAudioPlayer;

public class StoppedState implements IPlayerState {

	private static StoppedState instance = new StoppedState();

	public static StoppedState getInstance() {
		return instance;
	}

	@Override public void play(IAudioPlayer audioPlayer) {
		if (audioPlayer.hasTrackLoaded()) {
			System.out.println(String.format("\tPlaying %s...", audioPlayer.getCurrentTrack().toString()));
			audioPlayer.setState(PlayingState.getInstance());
		} else {
			System.out.println("\tNo track loaded.");
		}
	}

	@Override public void pause(IAudioPlayer audioPlayer) {
		System.out.println("\tNothing playing, nothing to pause.");
	}

	@Override public void stop(IAudioPlayer audioPlayer) {
		System.out.println("\tAlready stopped.");
	}
}
