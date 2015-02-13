package topic1.AudioPlayer;

public class AudioPlayer implements Player {
	
	private PlayerConcrete player;
	
	public AudioPlayer (String state, String name) {
		player = new AudioPlayerConcrete (state,name);
	}

	@Override
	public void setSoundTrack(String audioName) {
		player.setAudioName(audioName);
	}

	@Override
	public void setPlay() {		
		player.setStatus("Play");
	}

	@Override
	public void setPause() {
		player.setStatus("Pause");
	}

	@Override
	public void setStop() {
		player.setStatus("Stop");
	}

	@Override
	public String getSoundTrack() {
		return player.getAudioName();
	}

	@Override
	public String getSate() {
		return player.getStatus();
	}

}
