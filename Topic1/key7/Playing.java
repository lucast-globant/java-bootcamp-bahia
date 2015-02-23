package Topic1.key7;

public class Playing implements AudioPlayerState {

	@Override
	public void pressPlay(MediaAdaptee context) {
		System.out.println("no effect");

	}

	@Override
	public void pressStop(MediaAdaptee context) {
		System.out.println("Stopped");
		context.set_state(new Stopped());

	}

	@Override
	public void pressPause(MediaAdaptee context) {
		System.out.println("Paused");
		context.set_state(new Paused());

	}

}
