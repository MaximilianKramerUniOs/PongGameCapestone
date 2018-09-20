package starter;

import javax.swing.JFrame;

public class GUI {
	
	public GUI() {
		
		Variables.jf = new JFrame();
		Variables.jf.setSize(Variables.screenwidth, Variables.screenhight);
		Variables.jf.setTitle("PongGame");
		Variables.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variables.jf.setLayout(null);
		Variables.jf.setResizable(true);
		Variables.jf.setVisible(true);
		Variables.jf.setLocationRelativeTo(null);
		Variables.jf.addKeyListener(new Keyboard());
		Variables.jf.addKeyListener(new Keyboard2());
		Variables.jf.requestFocus();
		
		
		Draw label = new Draw();
		label.setBounds(0,0, Variables.screenwidth, Variables.screenhight);
		label.setVisible(true);
		Variables.jf.add(label);
		

		
		
	}
	
}
