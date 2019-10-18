package _07_drum_kit;

import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKitView {

	private DrumKitController controller;
	private JFrame frame;
	private JPanel panel;
	private JLabel drum;
	private JLabel cymbal;

	DrumKitView() {
			
		// 1. Complete the code in the makeFrame() method 
		makeFrame();

		// 2. Complete the code in the DrumKitController class
		controller = new DrumKitController(this);

		// 3. Complete the code in the addImages() method 
		addImages();
	}


	private void makeFrame() {

		/* The view first consists of 2 components: a frame and a panel */
		
		//    Initialize the frame variable  "new JFrame()"

		//    Make the frame visible
	
		//    Set the frame's default close operation to JFrame.EXIT_ON_CLOSE

		//    Set the title of the frame

		//    Initialize the panel variable  "new JPanel()"

		//    Add the panel to the frame

		//    Set the layout of the panel (use the code below)
		//      panel.setLayout(new GridLayout());

	}
	
	private void addImages() {
    	
    	/* This method will add 2 labels to the view. One for a drum and one for a cymbal */
    	
			/*      Use the makeLabelFromIcon method below
			*       Pass it the drum icon from the controller
			*       Set the drum JLabel from the returned JLabel value.
			*/

			//    Add the drum JLabel to the panel
	
			//    Call the pack() method on the frame. 
		
			/*   Run your program. 
			*       Do you see the frame? Do you see the drum image?
			*/
	
	
			//    Add a mouse listener to the drum JLabel (hint: the controller is a mouse listener) 
	
						
			/*    Now run the program and click on the drum. Do you hear the drum sound?
			*       If you did not, make sure you completed the code in the controller class
			*/


			//    Repeat the above steps to add a cymbal picture to the drum kit  

	}
	
	private JLabel makeLabelFromIcon (Icon icon) {
		return new JLabel(icon);
	}


	
}
