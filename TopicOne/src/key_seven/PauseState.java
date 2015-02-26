package key_seven;

public class PauseState implements AudioState {

	@Override
	public void doAction() {
		System.out.println("Audio Player: PAUSE");
	}

}
