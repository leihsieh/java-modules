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
		 
	
		 
		// 2. Tell the user whether they were correct or not (use the view for this)
		


		// 3. if the user has had too many tries (ask the  model) 

			// 	Tell the user their score (use the view)



			//	Exit the program



		// 4.  Tell the view to showNextImage 

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public Icon getNextRandomImage() {
		// The next line uses a Random object to get an arrow keyCode
		int keyCode = r.nextInt(4) + 37;

		// This code returns the image that goes with the arrow keyCode
		return model.getImageForKeyCode(keyCode);
	}
	
	
}
