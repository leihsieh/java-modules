package _05_body_part_quiz;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuizView {


	private JFrame window;
	private JPanel panel;
	private BodyPartQuizModel model = new BodyPartQuizModel();

	BodyPartQuizView () {
		makeFrame();
	}
	
	public void makeFrame() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		window = new JFrame();
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 4. Run the program, then change the window's dimensions 
		// so that you can only see part of each image. The first value
		// is the width, the second is the height.

		Dimension d = new Dimension(500	,500);
		window.setPreferredSize(d);
		
		showNextImage();

	}

	private void startQuiz() {

		// 1. Make a variable to hold the score.

		// 2. Look at BodyPartQuizModel. If you want to change the quiz pictures, 
		// set your image names there.

		// 3. Run the program. Do you see a picture? Now change the frame dimension in the initializeGui method
		
		// 5. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");

		// 6. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1

		// 7. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 8. Call the showNextImage() method below to get the next image

		// 9. .... repeat 5-8 for all your images.....

		// 10. Show the user their final score

	}

	public void showNextImage() {

		/* Get the next image from the model and put it into the frame */
		
		panel.removeAll();
		JLabel next = model.getNextImage();
		if (next == null) {
			window.dispose();
			JOptionPane.showMessageDialog(null, "No More Images");
			System.exit(0);
		}
		panel.add(next);
		window.setVisible(true);
		window.pack();
	}



}
