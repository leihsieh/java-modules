package _09_sound_effects_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsView {
	
	SoundEffectsController controller;
	
	SoundEffectsView() {

		// 2. Complete the code in the SoundEffectsController class
		
		controller = new SoundEffectsController(this);
		
		// 1. Complete the code in the makeFrame() method 
		makeFrame();


	}


	private void makeFrame() {
		
		// In this method you will need to write code to create the frame and all the 
		// components you will display to the user (buttons on a panel).
		// If you need help, look at other similar recipes you have already completed.

		
		// Don't forget to add a mouseListener (controller) to EVERY button. 
		
	}
}
