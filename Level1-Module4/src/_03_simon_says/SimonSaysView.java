package _03_simon_says;

import java.awt.Component;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SimonSaysView {
	private SimonSaysController controller;


	private JFrame frame;

	SimonSaysView() {

		// 13. Use a JOptionPane to tell the user the rules
		// The rules are in the SimonSaysModel class

		controller = new SimonSaysController(this);
		makeFrame();
	}

	private void makeFrame() {

		/* The view will consist of 2 components: a frame and a label 
		 * Because there is only one component on the frame, there is no need for a panel. */

		// 1. Create a frame.
		// Remember to set the frame to be visible and to exit on close

		// 2. Set the title of your frame (Simon Says). 
		// If you run the program now, you should see a very small window
	
		
		/* Before you can finish the View, you need to code the Model and Controller.
		 * 
		 *  4.  Complete the code of the model, SimonSaysModel.   
		 *  5.  Complete the code of the controller, SimonSaysController.
		 */

		
		// 6. Add a label to your frame. Use the getNextLabel method to make the label

		// 7. Pack the frame

		// 8. Run the program. Do you see an arrow key?

		
		// 9. Add a key listener to the frame so you know which arrow key is pressed
		// HINT: the controller is a KeyListener

		
		// 10. Run the program again. Now you can play Simon Says!

	}

	private JLabel getNextLabel() {
		JLabel label = new JLabel();
		label.setIcon(controller.getNextRandomImage());
		return label;
	}

	public void showNextImage() {
		frame.dispose();
		makeFrame();
	}

}