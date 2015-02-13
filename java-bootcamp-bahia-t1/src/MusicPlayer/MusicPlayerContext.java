package MusicPlayer;

public class MusicPlayerContext implements MusicPlayerState {

	private MusicPlayerState playerState;

	@Override
	public void action() {
		this.playerState.action();

	}

	public void setState(MusicPlayerState state) {
		this.playerState = state;
	}

	public MusicPlayerState getState() {
		return playerState;
	}

}
