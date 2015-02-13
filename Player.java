package topic1.AudioPlayer;

public interface Player {
	
	public void setSoundTrack (String audioName);
	
	public void setPlay ();
	
	public void setPause ();
	
	public void setStop ();
	
	public String getSoundTrack ();
	
	public String getSate();

}
