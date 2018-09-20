package starter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard2 implements KeyListener{

	
	public void keyTyped(KeyEvent f) {
		
		
	}

	
	public void keyPressed(KeyEvent f) {
		
	
	

	if (f.getKeyCode() == KeyEvent.VK_W){
	Variables.moveUp2 = true;
} else if (f.getKeyCode() == KeyEvent.VK_Y){
	Variables.moveDown2 = true;
 }
	}


	
	public void keyReleased(KeyEvent f) {
		
	
		
		if (f.getKeyCode() == KeyEvent.VK_W){
			Variables.moveUp2 = false;
		} else if (f.getKeyCode() == KeyEvent.VK_Y){
			Variables.moveDown2 = false;
		 }
		

	}
}
