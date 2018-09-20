package starter;

import java.awt.*;
import javax.swing.JLabel;

public class Draw extends JLabel {
	
	protected void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Variables.screenwidth, Variables.screenhight);
		
		g.setColor(Color.GREEN);
		
		for(int i = 0; i <= 30; i++) {
			g.fillRect(Variables.screenwidth/2-5, i*20 , 10, 10);
		}
		
		g.fillRect(Variables.x, Variables.y , 25, 150);
		g.fillRect(Variables.computerx, Variables.computery , 25, 150); // put in comments if you want to play with to Human players and delete the comment below
		//g.fillRect(Variables.humanx, Variables.humany, 25, 150);
		
		g.drawString("HUMAN1: " + Variables.playerPoints, Variables.screenwidth/2-95, 75);
		g.drawString("Computer " + Variables.computerPoints, Variables.screenwidth/2+25, 75);// put in comments if you want to play with to Human players and delete the comment below
		//g.drawString("HUMAN2: " + Variables.human2Points, Variables.screenwidth/2+25, 75);
		
		g.fillRoundRect(Variables.ballx, Variables.bally, 30, 30, 30, 30);
		
		
		repaint();
		 	
	}
	
}
