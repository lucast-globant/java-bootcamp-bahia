package topic_1_7;

public class Test {

	public static void main (String[] args) {
		
		Track track1 = new Track ("Do I Wana Know?","Arctic Monkeys","AM",2013,"4:23","Rock");
		Track track2 = new Track ("R U Mine?","Arctic Monkeys","AM",2013,"3:22","Rock");
		Track track3 = new Track ("Mad Sounds","Arctic Monkeys","AM",2013,"3:35","Rock");
		Track track4 = new Track ("Snap Out Of It","Arctic Monkeys","AM",2013,"3:13","Rock");
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.addTrack(track1);
		audioPlayer.addTrack(track2);
		audioPlayer.addTrack(track3);
		audioPlayer.addTrack(track4);
		
		audioPlayer.selectTrack(track3);
		
		audioPlayer.stopTrack();
		audioPlayer.playTrack();
		audioPlayer.stopTrack();
		audioPlayer.pauseTrack();
		audioPlayer.playTrack();
		
	}
}
