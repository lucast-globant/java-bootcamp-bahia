package topic1.audioplayer;

public class TestAudioPlayer {
	
	
	public static void main (String[] args) {

		AudioPlayer player = new AudioPlayer ("Track1");
		StateContext context; 
		//PLAY
		context = new StateContext (new Play ());
		context.executeAction(player);
		//PAUSE
		context = new StateContext (new Pause ());
		context.executeAction(player);
		//STOP
		context = new StateContext (new Stop ());
		context.executeAction(player);
	}
}
