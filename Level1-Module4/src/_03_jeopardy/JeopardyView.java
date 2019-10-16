package _03_jeopardy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JeopardyView {
	
	private JPanel quizPanel;
	private JButton firstButton, secondButton, thirdButton, fourthButton;
	private int buttonCount = 0;	
	
	private JLabel scoreBox = new JLabel("0");


	private JeopardyModel model;
	private JeopardyController controller;

	JeopardyView () {
		model = new JeopardyModel();
		controller = new JeopardyController(model, this);
		makeFrame();
	}
	
	
	public void makeFrame() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
frame.setVisible(true);
		// 2. Give your frame a title
frame.setTitle("Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader method
JPanel header = createHeader("TOPIC");
		// 4. Add the header component to the quizPanel
quizPanel.add(header);
		// 5. Add the quizPanel to the frame
frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
firstButton = createButton("100");
		// 7. Add the firstButton to the quizPanel
quizPanel.add(firstButton);
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
secondButton = createButton("200");
		// 10. Add the secondButton to the quizPanel
quizPanel.add(secondButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		//  HINT: The controller is an action listener
firstButton.addActionListener(controller);		
secondButton.addActionListener(controller);		
		// 12. Complete the JeopardyController class

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		

		
		frame.pack();

		// This code puts the score into the frame for you
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		
		
		
		// 14. Run the program. Do you see the buttons and the Topic?
		
		// 15. Now complete the model with the questions you are going to ask
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
JButton button = new JButton(dollarAmount);
		// Set the text of the button to the dollarAmount

		// Increment the buttonCount (this should make the layout vertical)
buttonCount++;
		// Return your new button instead of the temporary button
return button;
//		return new JButton("temporary button");
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	public void updateScore() {
		scoreBox.setText("" + model.getScore());
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}


