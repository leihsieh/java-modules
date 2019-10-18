package _08_body_part_quiz;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class BodyPartQuizController {

	private BodyPartQuizModel model;
	private BodyPartQuizView view;
	
	BodyPartQuizController(BodyPartQuizView view) {
		
		/* The controller acts as the go-between so needs to access the view and model */
				
		this.view = view;
		model = new BodyPartQuizModel();
	}
	
	
	public void getPlayerGuess() {	
	
		String guess = JOptionPane.showInputDialog("who is this?");

			//  Send the answer to the model for checking. 
			//  If they guessed correctly -- tell them they are right

			//  Otherwise -- tell them they are wrong 

			//  Tell the view to show the player the next person. 
			//  You will need to use the method below to get the next image from the model

	}
	
	
	public Icon getNextImage() {
		Icon next = model.getNextImage();
		
		if (next == null) {
			
			// Change the message dialog to include the player's score 			
			JOptionPane.showMessageDialog(null, "Game Over");

			System.exit(0);
		} 
		return next;
		
	}
	
}
