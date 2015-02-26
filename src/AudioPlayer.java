import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


public class AudioPlayer {
	
    public BasicPlayer player;

    public AudioPlayer() {
        player = new BasicPlayer();
    }
    public void Play() {
    	 try {
        player.play();
    	 } catch (Exception ex) {
             System.out.println("Error: " + ex.getMessage());
         }
    }

    public void openFile(String ruta){
    	try {
        player.open(new File(ruta));
    	 } catch (Exception ex) {
             System.out.println("Error: " + ex.getMessage());
         }
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }

}