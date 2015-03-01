public class StopState implements State {

	@Override
	public void play() {
		System.out.println("Stop -> Play");
	}

	@Override
	public void stop() {
		// do nothing
	}

	@Override
	public void pause() {
		System.out.println("Stop -> Pause");
	}

}
