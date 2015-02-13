package topic1.AudioPlayer;

public class Stop implements State {

	@Override
	public void modifyState() {
		System.out.println ("Stopped audio");
	}

	@Override
	public String getState() {
		return "Stop";
	}

}