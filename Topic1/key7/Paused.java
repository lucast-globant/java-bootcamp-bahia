package Topic1.key7;

public class Paused implements AudioPlayerState {

	@Override
	public void pressPlay(MediaAdaptee context) {
		context.set_state(new Stopped());
		System.out.println("resuming audio");
	}

	@Override
	public void pressStop(MediaAdaptee context) {
		context.set_state(new Stopped());
		System.out.println("stopped");
	}

	@Override
	public void pressPause(MediaAdaptee context) {
		System.out.println("no effect");

	}

}
