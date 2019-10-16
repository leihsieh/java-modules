package _02_simon_says;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class SimonSaysController implements KeyListener {

	private SimonSaysModel model; 
	private SimonSaysView view;
	private Random r = new Random();
	
	SimonSaysController (SimonSaysView view) {
		model = new SimonSaysModel();
		this.view = view;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub


		// 1. Send the keyCode to the model to see if keyIsCorrect
		 
	
		 
		// 2. Tell the user whether they were correct or not - use the methods below

		// 3. if the player has had too many tries (ask the  model) ....
		// 	tell them their score and exit the program


		// 4.  tell the view to showNextImage 

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public Icon getNextRandomImage() {
		// The next line uses a Random object to get an arrow keyCode
		int keyCode = r.nextInt(4) + 37;

		// This code gets the image that goes with the keyCode
		Icon icon = model.getImageForKeyCode(keyCode);
		
		if (model.simonSays()) {
			speak ("Simon Says");
		}
		
		return icon; 
	}

	private void correctAnswer() {
		speak("Correct");
	}

	private void wrongAnswer() {
		speak("Incorrect");
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
