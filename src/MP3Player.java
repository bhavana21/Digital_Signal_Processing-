
import java.awt.Color;

import javazoom.jl.player.StdPlayer;

public class MP3Player {
    public static void main(String[] args) {
    
   	String filename = args[0];
        StdPlayer.open(filename);
       
        while (!StdPlayer.isEmpty()) {

     StdPlayer.playWave(StdPlayer.getLeftChannel(), StdPlayer.getRightChannel());
   
        }
     StdPlayer.close();   
   System.exit(0);
        	
    }
}
