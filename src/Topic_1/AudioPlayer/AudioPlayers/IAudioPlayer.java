package Topic_1.AudioPlayer.AudioPlayers;

import Topic_1.AudioPlayer.PlayerStates.IPlayerState;
import Topic_1.AudioPlayer.Track;

public interface IAudioPlayer {

	public void load(Track track);

	public void pause();

	public void play();

	public void stop();

	public IPlayerState getState();

	public void setState(IPlayerState playerState);

	public Track getCurrentTrack();

	public boolean hasTrackLoaded();
}
