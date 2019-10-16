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
	private SimonSaysModel model;
	
	private JFrame frame;
	
	SimonSaysView() {
		model = new SimonSaysModel();
		
		// 1. Complete the SimonSaysModel before you start the View
		
		// 2. Use a JOptionPane to tell the user the rules
		// Make sure you get the rules from the SimonSaysModel

		
		controller = new SimonSaysController(model, this);
		makeFrame();
	}
	
	private void makeFrame() {
		
		// 3. Initialize your frame to a new JFrame()

		// 4. Set the frame to visible

		// 5. Uncomment the following line to add an image to your frame
		// 		frame.add(model.getNextRandomImage());

		// 6. Set the title of your frame

		// 7. Pack the frame

		// 8. Set the defaultCloseOperation of your from to
		// JFrame.EXIT_ON_CLOSE


		// 9. Run the program. Do you see an arrow key?

		// 10. Add a key listener to the frame
		// HINT: the controller is a KeyListener


		/* 11. Use the speak method to prompt the user
		 *  Hint: the prompt comes from the model
		*/ 


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

		//12. Use a dialog or the speak method to tell the user their final score
	
	}
	
	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}