package starter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_UP ){
		Variables.moveUp = true;
	} else if (e.getKeyCode() == KeyEvent.VK_DOWN ){
		Variables.moveDown = true;
	 }
	
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_UP){
			Variables.moveUp = false;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			Variables.moveDown = false;
		 }		
		
	}
		

}
