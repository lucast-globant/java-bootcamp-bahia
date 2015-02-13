package exercise1to6.exercise7;

public class MusicPlayer implements Player {
	private State state;
	public MusicPlayer() {
		
		this.state = new PlayMusic();
	}



	public void play() {
		state.play();
		state= new PlayMusic();

	}

	@Override
	public void pause() {
		state.pause();
		state= new PauseMusic();

	}

	@Override
	public void stop() {
		state.stop();
		state = new StopMusic();

	}

}
