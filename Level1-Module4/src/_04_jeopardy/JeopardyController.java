package _04_jeopardy;

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
		
		/* The controller acts as the go-between so it needs to access the view and model */		
		
		model  = new JeopardyModel();
		this.view = view;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/* WHen the player clicks a button, the game will pop up a question to be answered.
		* The game will play music while they think of an answer.
		* If their answer is correct, their score will increase.
		* If it's wrong, their score will decrease.
		* A button may only be pressed once during the game.
		*/
			
		//This code gets the button that the user pressed from the ActionEvent
			JButton buttonPressed = (JButton) e.getSource();	
			
		// 1.  If the button has no amount, the question has already been answered.
		//     Tell the user the question has already been answered and return.	
		//     Hint: Check for an empty string 


		// 2. Use the playJeopardyTheme() method to start the "thinking" music
		//    *** Be kind to your neighbors. Set the volume to a reasonable level before testing ***	

			
		// 3. Use the model to get the question that belongs to the button pressed.
		//    Hint: Convert the text of the buttonPressed to an Integer first, then use that as the "amount".

	
		// 4. Use a pop-up dialog to show the player the question and get their answer.



		// 5. Stop the theme music as soon as they have entered their response. 
		//	Hint: the sound variable contains the AudioClip.


		// 6. Use the model to check the player's answer.
			

		// 7. If it is correct, tell the player they got it right

		// 8. If it was incorrect, tell them it was wrong, but also 
		//	  tell them the right answer (from the model)

		// 9. Tell the view to update the score	(send it the score from the model)


		// 10. Tell the view to clear the text off the button that was pressed

		
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
