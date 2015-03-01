package topic1.audioplayer;

import topic1.audioplayer.AudioPlayer.StateTypes;

public class Stop implements StateStrategy {

	@Override
	public void executeAction (AudioPlayer player) {
		player.setState(StateTypes.Stop);
		System.out.println ("Stopped audio");
	}


}