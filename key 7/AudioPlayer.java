package topic1.audioplayer;

public class AudioPlayer {
	
	public enum StateTypes {Stop,Play,Pause}; 
	
	private String audioName; 
	private StateTypes state; 
	
	public AudioPlayer (String name) {
		audioName = name;
		state = StateTypes.Play;
	}

	public String getAudioName() {
		return audioName;
	}

	public void setAudioName(String audioName) {
		this.audioName = audioName;
	}
	
	public void setState (StateTypes state) {
		this.state = state;
	}
	
	public StateTypes getState () {
		return state;
	}
}
