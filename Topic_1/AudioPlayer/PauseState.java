public class PauseState implements State {

	@Override
	public void play() {
		System.out.println("Pause -> Play");
	}

	@Override
	public void stop() {
		System.out.println("Pause -> Stop");

	}

	@Override
	public void pause() {
		// do nothing
	}

}
