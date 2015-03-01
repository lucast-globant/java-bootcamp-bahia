package topic1.audioplayer;

import topic1.audioplayer.AudioPlayer.StateTypes;

public class Pause implements StateStrategy {

	@Override
	public void executeAction (AudioPlayer player) {
		player.setState(StateTypes.Pause);
		System.out.println ("Paussed audio");
	}

}