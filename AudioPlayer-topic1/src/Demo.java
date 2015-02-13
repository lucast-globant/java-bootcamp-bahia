public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audio = new AudioPlayer();

		// The three possible states
		State playing = new PlayingState();
		State paused = new PausedState();
		State stopped = new StoppedState();

		// Audio Player is playing
		audio.setState(playing);
		audio.request();

		// Audio Player is paused
		audio.setState(paused);
		audio.request();

		// Audio Player is stopped
		audio.setState(stopped);
		audio.request();
	}
}
