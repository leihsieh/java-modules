package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingView {

	public MyFirstSwingView() {
		makeFrame();
	}
	
	public void makeFrame() {
		
		/* The view in this program consists of 3 components: a frame, a panel, and a label */

		// 1. Create a JFrame object and store it in a variable like this:
		//      JFrame frame = new JFrame();
		
		// 2. Set the frame to be visible

		// 3. Set the frame's default close operation to JFrame.EXIT_ON_CLOSE
		// This will make sure the program exits when you close the window

		// 4. Run the MyFirstSwingGuiRunner program. Do you see a window? 
		// It's probably very small because it is empty. Close the frame.

		// 5. Create a JPanel object and store it in a variable like this:
		//      JPanel panel = new JPanel();

		// 6. Create a JLabel object and store it in a variable

		// 7. Set the text of the JLabel to a lovely greeting.

		// 8. Add the JLabel object to the JPanel

		// 9. Add the JPanel object to the JFrame

		// 10. Pack the JFrame.
		// This will make the frame big enough to show everything you added to the panel.

		// 11. Run MyFirstSwingGuiRunner again. Do you see your message? Close the frame.

		
		// 12. Use the loadImage method to set the icon of the JLabel object.

		// 13. Re-pack the JFrame.
		// This will make the frame big enough to show everything you added to the panel.
		
		// 14. Run MyFirstSwingGuiRunner one more time. Do you now see an image? Close the frame.

	}

	private ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {

			return null;
		}
	}
}
