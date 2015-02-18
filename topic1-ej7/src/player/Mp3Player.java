package player;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


public class Mp3Player {
    public BasicPlayer player;

    public Mp3Player() {
        player = new BasicPlayer();
    }
public void coge(String y){

}
    public void Play() throws Exception {
        player.play();
    }

    public void OpenFile(String rt) throws Exception {
        player.open(new File(rt));
        player.play();
    }

    public void Pause() throws Exception {
        player.pause();
    }
    

    public void Resume() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }
    public void reproducemp3 () throws Exception{
       try {
        Mp3Player player = new Mp3Player();
        player.OpenFile("C:/Users/Public/Music/Sample Music/Kalimba.mp3");
        player.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void main(String args[]) throws Exception{
     
    }
}