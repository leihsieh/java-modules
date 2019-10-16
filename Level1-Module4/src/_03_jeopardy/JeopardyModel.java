package _03_jeopardy;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;



public class JeopardyModel {

	private int score = 0;
	private AudioClip sound;	
	


	public int getScore() {
		return score;
	}
	
	public void askQuestionForAmount(String buttonLabel) {
	
		// Use the playJeopardyTheme() method to play music while you ask the user a queston
		
playJeopardyTheme();		
		
		// Check the buttonLabel and ask a question depending on the label
		// Use a dialog to ask the question
		// $100 questions should be easier than $1000 questions

String answer = JOptionPane.showInputDialog("To be or not to be");
		
		
		// Stop the theme music when they have entered their response. Hint: use the sound variable 
sound.stop();		
		// If the answer is correct
if (answer.equalsIgnoreCase("Yes")) {	
			// Increase the score by the prizeMoney
score += Integer.parseInt(buttonLabel);	
			// Pop up a message to tell the user they were correct
JOptionPane.showMessageDialog(null, "Correct");	
}
		// Otherwise
else {	
			// Decrement the score by the prizeMoney (check for zero?)
	score -= Integer.parseInt(buttonLabel);	
	
			// Pop up a message to tell the user they were wrong and give them the correct answer
	JOptionPane.showMessageDialog(null, "Inorrect. the answer is yes");
}
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
