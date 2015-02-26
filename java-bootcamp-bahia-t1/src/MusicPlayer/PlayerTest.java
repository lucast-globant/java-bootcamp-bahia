package MusicPlayer;

public class PlayerTest {

	public static void main(String[] args) {

		MusicPlayerContext context = new MusicPlayerContext();
		MusicPlayerState play = new PlayState();
		MusicPlayerState pause = new PauseState();
		MusicPlayerState stop = new StopState();

		context.setState(play);
		context.action();

		context.setState(pause);
		context.action();

		context.setState(stop);
		context.action();

	}

}
