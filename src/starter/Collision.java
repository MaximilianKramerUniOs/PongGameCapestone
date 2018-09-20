package starter;

import java.util.Timer;
import java.util.TimerTask;

public class Collision {
	
Timer collision;

	public Collision() {
		
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Variables.bally +50 >= Variables.screenhight) {
					Variables.balldirectiony = -1;
				}
				
				if(Variables.bally <= 0) {
					Variables.balldirectiony =+1;
				}
				
				if(Variables.ballx +20 >= Variables.screenwidth) {
					
					Variables.ballx = Variables.screenwidth / 2 -10;
					Variables.bally = Variables.screenhight / 2 -10;
				
					Variables.balldirectionx = -1;
					Variables.playerPoints +=1;
				}
				
				if(Variables.ballx <= 0) {
					
					Variables.ballx = Variables.screenwidth / 2 -10;
					Variables.bally = Variables.screenhight / 2 -10;
				
					Variables.balldirectionx = 1;
					Variables.computerPoints +=1;
					Variables.human2Points +=1;
					
				}
				
				if(Variables.ballx < Variables.x +25 && Variables.ballx > Variables.x && Variables.bally -20 < Variables.y +150 && Variables.bally > Variables.y) {
					
					Variables.balldirectionx = 1;
					
				}
				
				if(Variables.ballx < Variables.computerx && Variables.ballx > Variables.computerx -25  && Variables.bally -20 < Variables.computery +150 && Variables.bally > Variables.computery) {
					
					Variables.balldirectionx = -1;
					
				} // put in comments if you want to play with to Human players and delete the comments below
				
				//if(Variables.ballx < Variables.humanx && Variables.ballx > Variables.humanx -25  && Variables.bally -20 < Variables.humany +150 && Variables.bally > Variables.humany) {
					
				//	Variables.balldirectionx = -1;
					
				//} 
				
			}
		
		}, 0, 4);
 }

}
