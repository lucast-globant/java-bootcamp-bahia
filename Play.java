package topic1.AudioPlayer;

public class Play implements State {

	@Override
	public void modifyState() {
		System.out.println ("Playing audio");
	}

	@Override
	public String getState() {
		return "Play";
	}

}
