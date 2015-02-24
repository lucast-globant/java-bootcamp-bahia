package Topic_1.AudioPlayer.PlayerStates;

import Topic_1.AudioPlayer.AudioPlayers.IAudioPlayer;

public interface IPlayerState {

	public void play(IAudioPlayer audioPlayer);

	public void pause(IAudioPlayer audioPlayer);

	public void stop(IAudioPlayer audioPlayer);
}
