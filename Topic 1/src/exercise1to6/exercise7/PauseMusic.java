package exercise1to6.exercise7;

public class PauseMusic implements State {

	@Override
	public void play() {
		System.out.println("Play Song \n");

	}

	@Override
	public void pause() {

	}

	@Override
	public void stop() {
		System.out.println("Stop Song \n");


	}

}
