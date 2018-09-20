package starter;

import java.util.Timer;
import java.util.TimerTask;

public class computerMove {
	
Timer move;

	public computerMove() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Variables.ballx >= Variables.screenwidth/2 -10) {
					
				
						if(Variables.bally == Variables.computery) {
							
				}else if (Variables.bally > Variables.computery +75) {
					
					if(Variables.computery <= Variables.screenhight - 200) {
						Variables.computery += 2;
						
					}
				} else if (Variables.computery < Variables.computery + 75) {
					
					if (Variables.computery >= 20) {
						Variables.computery -= 20;
					}
				}
			}
		}
		}, 0, 6);
	}
	}


