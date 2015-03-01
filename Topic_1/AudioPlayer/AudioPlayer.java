public class AudioPlayer implements IAudioPlayer {
	protected State state;

	public AudioPlayer() {
		state = new StopState();
	}

	@Override
	public void play() {
		state.play();
		state = new PlayState();
	}

	@Override
	public void pause() {
		state.pause();
		state = new PauseState();
	}

	@Override
	public void stop() {
		state.stop();
		state = new StopState();
	}
}
