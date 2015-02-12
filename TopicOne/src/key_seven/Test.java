package key_seven;

public class Test {

	public static void main(String[] args) {

		AudioState stop = new StopState();
		AudioContext con = new AudioContext(stop);
		AudioState start = new StartState();
		AudioState pause = new PauseState();

		con.doAction();
		con.setState(start);
		con.doAction();
		con.setState(pause);
		con.doAction();
		con.setState(stop);
		con.doAction();

	}

}
