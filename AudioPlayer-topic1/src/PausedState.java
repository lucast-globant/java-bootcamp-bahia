public class PausedState implements State {

	@Override
	public void handle() {
		System.out.println("Audio Player is paused.");
	}
}
