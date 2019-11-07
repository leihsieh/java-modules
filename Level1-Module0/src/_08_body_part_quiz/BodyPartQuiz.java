package _08_body_part_quiz;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {


	private JFrame window;
	private JPanel panel;
	private BodyPartQuizController controller;

	BodyPartQuiz () {

		controller = new BodyPartQuizController(this);
		
		// 1. Look at the BodyPartQuizModel class. If you want to change the quiz pictures, 
		// set your image names there first.
		
		makeFrame();
	}
	
	public void makeFrame() {

		/* The View first consists of 2 Components: a frame and a panel */
		
		window = new JFrame();
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		Dimension dimension = new Dimension(250	,250);
		window.setPreferredSize(dimension);
		
		showNextImage(controller.getNextImage());

		// 2. Run the program. Do you see a picture? Change the frame's Dimension above
		//    so the player can only see the top half of the face.
		


	}

	public void showNextImage(Icon icon) {

		/* This method removes any existing Components from the panel, then it adds a new picture (label) */
		
		panel.removeAll();
		JLabel next = new JLabel();
		next.setIcon(icon);
		panel.add(next);
		window.setVisible(true);
		window.pack();
		
		// 3. Tell the Controller (BodyPartQuizController) to get the player's guess
		//    for the new image being displayed

	}



}
