package starter;

import java.util.Timer;
import java.util.TimerTask;

public class Human2 {

	Timer move2;
	
	public Human2() {
		move2 = new Timer();
		move2.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Variables.moveUp2 == true) {
					if(Variables.humany >= 20) {
						Variables.humany -= 2;
					}
				}else if (Variables.moveDown2 == true) {
					if(Variables.humany <= Variables.screenhight - 170) {
						Variables.humany += 2;
					}
				}
				
			}
		}, 0, 2);
	}

}
