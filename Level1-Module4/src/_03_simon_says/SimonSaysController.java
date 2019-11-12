package _03_simon_says;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class SimonSaysController implements KeyListener {

	private SimonSaysModel model; 
	private SimonSaysView view;

	
	SimonSaysController (SimonSaysView view) {
		
		/* The controller acts as the go-between so needs to access the view and model */		
		
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


		// 1. Get the keyCode from the KeyEvent, 
		//    and send it to the model to see if it is correct (keyIsCorrect)
		 
		 
		// 2. Tell the user whether they were correct or not - use the methods below

		
		// 3. if the player has had too many tries (ask the  model) ....
		// 	tell them their score and exit the program


		// 4.  otherwise, tell the view to showNextImage 

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public Icon getNextRandomImage() {
		// This code gets the image that the player will see
		Icon icon = model.getNextKeyImage();
		
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
