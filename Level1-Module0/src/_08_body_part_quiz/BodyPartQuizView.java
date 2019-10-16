package _08_body_part_quiz;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuizView {


	private JFrame window;
	private JPanel panel;
	private BodyPartQuizController controller;

	BodyPartQuizView () {

		controller = new BodyPartQuizController(this);
		
		// 1. Look at BodyPartQuizModel. If you want to change the quiz pictures, 
		// set your image names there first.
		
		makeFrame();
	}
	
	public void makeFrame() {

		/* The view first consists of 2 components: a frame and a panel */
		
		window = new JFrame();
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		Dimension d = new Dimension(250	,150);
		window.setPreferredSize(d);
		
		showNextImage(controller.getNextImage());

		// 2. Run the program. Do you see a picture? Change the frame's dimension above
		//    so the player can only see some of the face.
		


	}

	public void showNextImage(Icon icon) {

		/* This method removes any existing components from the panel, then adds a new label */
		
		panel.removeAll();
		JLabel next = new JLabel();
		next.setIcon(icon);
		panel.add(next);
		window.setVisible(true);
		window.pack();
		
		// 3. Tell the controller (BodyPartQuizController) to get the player's guess
		//    for the image being displayed

	}



}
