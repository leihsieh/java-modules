package _02_simon_says;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class SimonSaysController implements KeyListener {

	private SimonSaysModel model; 
	private SimonSaysView view;
	
	SimonSaysController (SimonSaysModel model, SimonSaysView view) {
		this.model = model;
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

}
