package key_seven;

public class StopState implements AudioState {

	@Override
	public void doAction() {
		System.out.println("Audio Player: STOP");
	}

}
