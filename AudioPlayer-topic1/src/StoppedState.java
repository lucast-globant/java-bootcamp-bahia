public class StoppedState implements State {

	@Override
	public void handle() {
		System.out.println("Audio Player is stopped.");
	}
}
