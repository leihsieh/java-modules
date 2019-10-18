package _09_sound_effects_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsView {
	
	SoundEffectsController controller;
	
SoundEffectsView() {
		
		// 1. Complete the code in the makeFrame() method 
		makeFrame();

		// 2. Complete the code in the DrumKitController class
		//controller = new DrumKitController(this);

	}


	private void makeFrame() {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("Drum");
controller = new SoundEffectsController(this);
button.addMouseListener(controller);
frame.add(panel);
panel.add(button);
frame.setVisible(true);
frame.pack();
	}


}
