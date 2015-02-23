package Topic1.key7;

public class Stopped implements AudioPlayerState {

	@Override
	public void pressPlay(MediaAdaptee context) {
		context.set_state(new Playing());
		System.out.println("Begin playing Audio");

	}

	@Override
	public void pressStop(MediaAdaptee context) {
		
		System.out.println("no effect");

	}

	@Override
	public void pressPause(MediaAdaptee context) {
		System.out.println("no effect");

	}

}
