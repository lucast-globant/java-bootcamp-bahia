package topic1.AudioPlayer;

public class TestAudioPlayer {
	
	
	public static void main (String[] args) {

		Player audioPlayer = new AudioPlayer ("Play","Track1");
		System.out.println ("The Audio Player state is: "+audioPlayer.getSate()+"\nAudio track: "+audioPlayer.getSoundTrack());
		audioPlayer.setPause();
		System.out.println ("The Audio Player state is: "+audioPlayer.getSate()+"\nAudio track: "+audioPlayer.getSoundTrack());
	}
}
