import java.awt.Color;
import javazoom.jl.player.StdPlayer;

public class MP3Viewer {

	public static void main(String[] args) {
		String filename = args[0];
		StdPlayer.open(filename);
		StdDraw.setCanvasSize(1000, 500);
		
		while (!StdPlayer.isEmpty()) {
					
			StdDraw.clear();
			StdDraw.setXscale(0, StdPlayer.getLeftChannel().length);
			StdDraw.setYscale(-0.8, 0.8);
			StdDraw.setPenColor(Color.BLUE);

			for (int i = 1; i < StdPlayer.getLeftChannel().length; i++) {
				StdDraw.line(i - 1, StdPlayer.getLeftChannel()[i - 1], i,StdPlayer.getLeftChannel()[i]);
				
			}
			StdDraw.clear();
			
			StdDraw.setXscale(0, StdPlayer.getRightChannel().length);
			StdDraw.setYscale(-0.8, 0.8);
			StdDraw.setPenColor(Color.RED);

			for (int i = 1; i < StdPlayer.getRightChannel().length; i++) {

				StdDraw.line(i - 1, StdPlayer.getRightChannel()[i - 1], i,StdPlayer.getRightChannel()[i]);
			}
		}

	}

}
