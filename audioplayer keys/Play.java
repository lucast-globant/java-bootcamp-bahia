package topic1.audioplayer;

import topic1.audioplayer.AudioPlayer.StateTypes;

public class Play implements StateStrategy {

	@Override
	public void executeAction (AudioPlayer player) {
		player.setState(StateTypes.Play);
		System.out.println ("Playing audio");
	}

}
