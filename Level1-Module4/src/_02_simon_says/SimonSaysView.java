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
		
		// 4. Set the title of your frame

		
		/* Before you can complete the rest of the view, you need to code the model and controller.
		 * 
		 *  5.  The model, SimonSaysModel, has the rules of the game. Complete this class next.
		 *   
		 *  6.  The controller, SimonSaysController, captures the player's input. Complete this class next.
		 */

		// 7. Add a label to your frame. Use the getNextLabel method to make the label

		// 8. Pack the frame

		// 9. Run the program. Do you see an arrow key?

		
		// 10. Add a key listener to the frame
		// HINT: the controller is a KeyListener

		// 11. Use the speak method to prompt the user Hint: the prompt comes from the model
		
		// 12. Run the program again. 

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

	public void correctAnswer() {
		speak("Correct");
	}

	public void wrongAnswer() {
		speak("Incorrect");
	}

	public void reportScore() {

		// 14. Use a dialog or the speak method to tell the user their final score

	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}