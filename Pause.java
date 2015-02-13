package topic1.AudioPlayer;

public class Pause implements State {

	@Override
	public void modifyState() {
		System.out.println ("Paussed audio");
	}

	@Override
	public String getState() {
		return "Pause";
	}

}