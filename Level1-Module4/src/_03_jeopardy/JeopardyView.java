package _03_jeopardy;

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

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up

		// 2. Give your frame a title

		// 3. Pick a topic for your Jeopardy Game.
		//    Use the createHeader method to create a JPanel that will show the topic

		// 4. Add the header from step 3 to the quizPanel

		// 5. Add the quizPanel to the frame

		// 6. Write the code to complete the createButton() method below. 

		// 7. Use the createButton method to set the value of firstButton
		//    USE "100" for the Amount

		// 8. Add the firstButton to the quizPanel. 
		//	  Run the program.
		//    Check that your game looks like Figure 1 in the recipe page


		// 9. Use the createButton method 3 more times to set the values of the 
		//    secondButton, thirdButton, and fourthButton
		//    USE "200", "400", and "800" for the amounts

		// 10. Add all buttons to the quizPanel. Run the program. They should all be there.

		
		// 11. *** Now complete the code in the JeopardyController class ***


		// 12. Add action listeners to all the buttons
		//  HINT: The controller is an action listener
				
		// 13. Run the program again. Do you see the buttons and the Topic?
		
		// 14. *** Now complete the model (JeopardyModel) with real questions you are going to ask ***

		


		// This code shows the score at the top of the frame
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		
		

	}


	private JButton createButton(String amount) {

		// 6.1  Create a new JButton

		// 6.2  Set the text of the button to show the amount

		// 6.3  Increment the buttonCount variable (this should make the layout vertical)

		// 6.4  Return the button 


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


