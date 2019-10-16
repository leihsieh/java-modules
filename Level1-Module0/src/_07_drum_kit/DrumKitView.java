package _07_drum_kit;

import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKitView {

	private DrumKitController controller;
	private DrumKitModel model;
	private JFrame frame;
	private JPanel panel;
	private JLabel drum;
	private JLabel cymbal;

	DrumKitView() {
		
		// 1. Complete the code in the makeFrame() method 


	   	// 2. Complete the code in the DrumKitModel class

		
		// 3. Complete the code in the DrumKitController class

		
		// 4. Complete the code in the addImages() method 
	
	}


	private void makeFrame() {

		/* The view first consists of 2 components: a frame and a panel */
		
		// 1.1  Initialize the frame variable  "new JFrame()"

		// 1.2  Make the frame visible
	
		// 1.3  Set the frame's default close operation to JFrame.EXIT_ON_CLOSE

		// 1.4  Set the title of the frame

		// 1.5  Initialize the panel variable  "new JPanel()"

		// 1.6  Add the panel to the frame

		// 1.7  Set the layout of the panel (use the code below)
		//      panel.setLayout(new GridLayout());

	}
	
	private void addImages() {
    	
    	/* This method will add 2 labels to the view. One for a drum and one for a cymbal */
    	
			/* 4.1  Use the makeLabelFromIcon method below
			*       Pass it the drum icon from the model as its parameter
			*       Set the drum JLabel from the returned JLabel value.
			*/

			// 4.2  Add the drum JLabel to the panel
	
			// 4.3  Call the pack() method on the frame. 
		
			/* 4.4  Run your program. 
			*       Do you see the frame? Do you see the drum image?
			*/
	
	
			// 4.5  Add a mouse listener to the drum JLabel (hint: the controller is a mouse listener) 
	
						
			/* 4.6  Now run the program and click on the drum. Do you hear the drum sound?
			*       If you did not, make sure you completed the code in the controller class
			*/


			// 4.7  Repeat the above steps to add a cymbal picture to the drum kit  

	
	}
	
	private JLabel makeLabelFromIcon (Icon icon) {
		return new JLabel(icon);
	}

	public void playSoundForLabel (JLabel label) {
		if (label == drum) {
			model.getDrumSound().play();
		}
		// This method will play the drum kit sounds from the model	
		if (label == cymbal) {
			model.getCymbalSound().play();
		}
		
	}
	
	
}
