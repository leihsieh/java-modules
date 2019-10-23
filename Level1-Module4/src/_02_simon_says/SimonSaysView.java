package _02_simon_says;

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

		/* The view first consists of 2 components: a frame and a label */

		// 1. Initialize your frame to a new JFrame()

		// 2. Set the frame to visible

		// 3. Set the defaultCloseOperation of your from to
		// JFrame.EXIT_ON_CLOSE

		// 4. Set the title of your frame. If you run the program, you should see a very small window
	
		
		/* Before you can complete the rest of the view, you need to code the model and controller.
		 * 
		 *  5.  The model, SimonSaysModel, has the rules of the game. Complete this class next.
		 *   
		 *  6.  The controller, SimonSaysController, captures the player's input. Complete this class next.
		 *  
		 */

		
		// 7. Add a label to your frame. Use the getNextLabel method to make the label

		// 8. Pack the frame

		// 9. Run the program. Do you see an arrow key?

		
		// 10. Add a key listener to the frame. This will get the player's input to the game
		// HINT: the controller is a KeyListener

		
		// 11. Run the program again. Now you can play Simon Says!

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