public class AudioPlayer {

	// Current state of the Audio Player
	private State state;

	public AudioPlayer() {
		state = new StoppedState();
	}

	public void setState(State s) {
		state = s;
	}

	public State getState() {
		return state;
	}

	public void request() {
		state.handle();
	}
}
