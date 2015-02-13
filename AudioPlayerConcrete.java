package topic1.AudioPlayer;

public class AudioPlayerConcrete implements PlayerConcrete {

	private State status; 
	private String audioName; 
	
	public AudioPlayerConcrete (String status, String name) {
		this.status = stringToState (status);
		audioName = name;
	}

	private State stringToState (String st) {
		State state; 
		switch (st) {
			case "Play": state = new Play();
					break;	
			case "Stop": state = new Stop ();
				break;
			case "Pause": state = new Pause ();
				break;
			default:
				state = null;
				break;
		}
		return state;		
	}
	
	@Override
	public String getStatus() { 
		return status.getState();
	}

	@Override
	public void setStatus(String status) {
		this.status = stringToState (status);
	}

	@Override
	public String getAudioName() {
		return audioName;
	}

	@Override
	public void setAudioName(String audioName) {
		this.audioName = audioName;
	}
	
}
