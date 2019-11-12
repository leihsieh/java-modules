package _04_jeopardy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JeopardyView {
	
	private JFrame frame;
	private JPanel quizPanel;
	private JButton firstButton, secondButton, thirdButton, fourthButton;
	private int buttonCount = 0;	
	
	private JLabel scoreBox = new JLabel("0");

	private JeopardyController controller;

	JeopardyView () {

		controller = new JeopardyController(this);
		makeFrame();
	}
	
	
	public void makeFrame() {
		
		/* 	The view consists of 3 main components: a frame and two panels 
		 * 	One panel has the entire quiz, the other has just the header
		 *  The quiz panel will have 4 buttons, one for each Jeopardy question
		 */

		// 1. Create a frame and store it in the frame member variable.
		//    Remember to set the frame to be visible, exit on close, and give it a title


		//2. Create a panel and store it in the quizPanel member variable.

		// This line of code arranges the components in the frame
		frame.setLayout(new BorderLayout());

		// 3. Pick a topic for your Jeopardy Game questions.
		//    Use the createHeader method to create another JPanel that will show the topic at the top

		// 4. Add the header panel from step 3 to the quizPanel from step 2

		// 5. Add the quizPanel to the frame

		// 6. Write the code to complete the createButton() method below. 

		// 7. Use the createButton method to set the value of the firstButton variable
		//    USE "100" for the amount on this button
		//    Add the firstButton to the quizPanel. 

		
		// 8. Use the createButton method 3 more times to set the values of the 
		//    secondButton, thirdButton, and fourthButton and add them to the quizPanel
		//    USE "200", "400", and "800" for the amounts

		// 9.  Run the program.
		//    Check that your game looks like Figure 1 on the recipe page



		
		// 10. *** Now complete the code in the JeopardyController class ***


		// 11. Add an ActionListener (controller) to each button
		
		
		// 12. *** Now complete the model (JeopardyModel) with actual questions you are going to ask ***

		
		// 13. Run the program again and play Jeopardy. 
		//    Check the buttons are cleared after they are answered, and the score updates correctly.
		//    See Figure 2 on the recipe page
		


		// This code shows the score at the top of the frame. You do not need to change it.
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);

		
		// Change the size of the frame if you need to
		frame.setSize(300, 500);

	}


	private JButton createButton(String amount) {

		// Create a new JButton

		// Set the text of the button to show the amount (parameter)

		// Increment the buttonCount variable (used for the layout)

		// Return the button 


	}
	
	
	// The following methods are complete and should not have to be modified.
	
	public void clearButton (JButton button ) {
		button.setText("");
		frame.repaint();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	public void updateScore(int score) {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

}


