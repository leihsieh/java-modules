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


		/* 1. Send the keyCode to the model to see if keyIsCorrect
		* 	Use the speak method to tell the user they were correct
		*   or not. OPTION: Change the wording based on whether Simon said or not
		*/
		
if (model.keyIsCorrect(e.getKeyCode())) {
	view.speak("Correct");
}
else {
	view.speak ("Wrong");
}


		// 25. if the user has had too many tries (check the  model) 
if (model.tooManyTries()) {
			// 	Tell the user their score

JOptionPane.showMessageDialog(null, "You scored: "+model.points);	

			//	Exit the program
System.exit(0);

}
	// 26.  Tell the view to showNextImage 
view.showNextImage();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
