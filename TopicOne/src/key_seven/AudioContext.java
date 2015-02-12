package key_seven;

public class AudioContext implements AudioState{

	private AudioState audioState;
	
	public AudioContext(AudioState audioState){
		this.audioState = audioState;
	}
	
	public void setState( AudioState state){
		this.audioState = state;
	}
	
	public AudioState getState(){
		return audioState;
	}

	@Override
	public void doAction() {
		audioState.doAction();
	}
	
}
