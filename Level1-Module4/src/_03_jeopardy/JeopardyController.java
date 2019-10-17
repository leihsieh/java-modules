package _03_jeopardy;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class JeopardyController  implements ActionListener{

	
	private JeopardyModel model;
	private JeopardyView view;
	private AudioClip sound;	


	JeopardyController(JeopardyView view) {
		model  = new JeopardyModel();
		this.view = view;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		/* WHen the player clicks a button, the game will pop up a question to be answered.
		* The game will play music while they think of an answer.
		* If they get the question right their score will increase.
		* If they get the question wrong their score will decrease.
		* A button may only be pressed once during the game.
		*/
			
		//This code gets the button that the user pressed to select a question
			JButton buttonPressed = (JButton) e.getSource();	
			
		// 1. If the button has no amount, the question has already been answered.
		//     Tell the user the question has already been answered and return.	
		//     Hint: Check for an empty string 


		// 2. Get the question that belongs to the button pressed.
		//    Hint: Send the text of the button to the model to get the question for that amount


		// 3. Use the playJeopardyTheme() method to play music while you ask the player a question
		//    *** Be kind to your neighbors. Set the volume to a reasonable level before testing ***	

		// 4. Use a pop-up dialog to ask the player the question from Step 2.


		// 5. Stop the theme music when they have entered their response. 
		//	Hint: the sound variable has the music


		// 6. Send the model the player's answer to find out if it is correct
			

		// 7. If it is correct, tell the player they got it right

		// 8. If it was incorrect, tell them it was wrong, but also 
		//	  tell them the right answer (the model has it)

		// 9. Tell the view to update the score	


		// 10. Tell the view to clear the text of the button that was pressed
	
		
	}

	
public void playJeopardyTheme() {
	try {
		sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
		sound.play();
		Thread.sleep(3400);
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
}
