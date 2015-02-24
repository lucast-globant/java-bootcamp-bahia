package Topic_1.AudioPlayer.PlayerStates;

import Topic_1.AudioPlayer.AudioPlayers.IAudioPlayer;

public class PausedState implements IPlayerState {

	private static PausedState instance = new PausedState();

	public static PausedState getInstance() {
		return instance;
	}

	@Override public void play(IAudioPlayer audioPlayer) {
		System.out.println(String.format("\tResuming %s...", audioPlayer.getCurrentTrack().toString()));
		audioPlayer.setState(PlayingState.getInstance());
	}

	@Override public void pause(IAudioPlayer audioPlayer) {
		System.out.println("\tAlready paused.");
	}

	@Override public void stop(IAudioPlayer audioPlayer) {
		System.out.println("\tStopped!");
		audioPlayer.setState(StoppedState.getInstance());
	}
}
