import javazoom.jl.player.StdPlayer; 
import java.awt.*;

public class Wave { 
    private  int N;     
    public double[] leftChannel = null;   
    public double[] rightChannel = null;  

    public Wave(double Hz, double seconds, double amplitude) { 
     int sps = 44100; 
    N  = (int) (sps * seconds); 
      leftChannel = new double[N+1]; 
      rightChannel = new double[N+1]; 
     
     for (int i = 0; i <= N; i++) { 
        leftChannel[i] = amplitude * Math.sin(2 * Math.PI * i * Hz / sps); 
        rightChannel[i] = amplitude * Math.sin(2 * Math.PI * i * Hz / sps); 
     } 
       //StdPlayer.playWave(leftChannel, rightChannel); //IT PLAYS HERE 
     
    } 


    public void play() { 
     
    StdPlayer.playWave(leftChannel, rightChannel); 
    } 
    
   
    public Wave (double[] l, double[] r) {
  
    }
    
    public Wave plus(Wave b){
    	
    	double[] left = new double[this.leftChannel.length];
    	double[] right = new double[this.rightChannel.length];
    	for(int i=0;i<this.leftChannel.length;i++){
    	left[i] = this.leftChannel[i] + b.leftChannel[i]; }
    	for(int i=0;i<this.rightChannel.length;i++){
        right[i] = this.rightChannel[i] + b.rightChannel[i]; }
    	b.leftChannel = left;
    	b.rightChannel = right;
		return b;
    	
    }
   public void draw(double[] l,double[] r){
    	StdDraw.setCanvasSize(1000, 500);
    	StdDraw.setXscale(0, l.length);
    	StdDraw.setYscale(-0.8, 0);
    	StdDraw.setPenColor(Color.BLUE);
    //	System.out.println(l[0]);
      	for(int i=1;i<l.length;i++)
  	{
      		
  		StdDraw.line(i-1, l[i-1], i,l[i] );
  	}    
  	StdDraw.setXscale(0, r.length);
  	StdDraw.setYscale(0,0.8);
    StdDraw.setPenColor(Color.RED);
	for(int i=1;i<r.length;i++)
  	{
  		StdDraw.line(i-1,r[i-1], i,r[i] );
  	}    
    }

}  