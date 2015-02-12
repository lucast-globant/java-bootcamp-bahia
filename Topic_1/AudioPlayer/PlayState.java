public class PlayState implements State {

	@Override
	public void play() {
		// do nothing
	}

	@Override
	public void stop() {
		System.out.println("Play -> Stop");
	}

	@Override
	public void pause() {
		System.out.println("Play -> Pause");
	}

}
