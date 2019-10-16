package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuizView {
	
	public PhotoQuizView() {
		makeFrame();
	}

	public void makeFrame() {
		
		/* The view consists of 2 components: a frame and a label */

		JFrame frame = new JFrame();
		// JFrames are invisible when they are first created. You have to make them visible.
		frame.setVisible(true);
		// This will make sure the program exits when you close the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		// 1. find an image on the Internet, and put its URL in a String variable
		//  (from your browser, right click on the image, and select “Copy Image Address”)
		

		// 2. create a variable of type JLabel that will hold your image

		// 3. use the "createImage()" method below to initialize your label from the URL String

		// 4. add the label to the frame

		// 5. call the pack() method on the frame

		// Run PhotoQuizRunner. Do you see the image?

		
		
		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the label from the frame (you may not see the
		// effect of this until step 11)

		// 10. find another image and add it to the frame (see steps 1-5 above

		// Run the program again. Do you see the 2nd image?

		
		// 11. ask another question

		// 12+ check answer, say if correct or incorrect, etc.
		

		/* OPTIONAL */
		// Add scoring to your quiz

	}

	private JLabel createImage(String imageUrl)  {
		JLabel imageLabel = new JLabel();
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		}
		catch (Exception e) {
			imageLabel.setText("Image Not Found");
		}
		return imageLabel;
	}


}
