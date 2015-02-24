package Topic_1.AudioPlayer.PlayerStates;

import Topic_1.AudioPlayer.AudioPlayers.IAudioPlayer;

public class PlayingState implements IPlayerState {

	private static PlayingState instance = new PlayingState();

	public static PlayingState getInstance() {
		return instance;
	}

	@Override public void play(IAudioPlayer audioPlayer) {
		System.out.println("\tAlready playing.");
	}

	@Override public void pause(IAudioPlayer audioPlayer) {
		System.out.println("\tPaused!");
		audioPlayer.setState(PausedState.getInstance());
	}

	@Override public void stop(IAudioPlayer audioPlayer) {
		System.out.println("\tStopped!");
		audioPlayer.setState(StoppedState.getInstance());
	}
}
