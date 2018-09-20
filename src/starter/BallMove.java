package starter;

import java.util.Timer;
import java.util.TimerTask;

public class BallMove {

Timer move;	
	
	public BallMove() {
		
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				Variables.bally += Variables.balldirectiony;
				Variables.ballx += Variables.balldirectionx;
				
			}
			
		}, 0, 3);
		
	}

}
