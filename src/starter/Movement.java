package starter;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {

	Timer move;
	
	public Movement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Variables.moveUp == true) {
					if(Variables.y >= 20) {
						Variables.y -= 2;
					}
				}else if (Variables.moveDown == true) {
					if(Variables.y <= Variables.screenhight - 170) {
						Variables.y += 2;
					}
				}
				
			}
		}, 0, 2);
	}

}
