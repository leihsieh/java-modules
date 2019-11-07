package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {

	public MyFirstSwingGUI() {
		makeFrame();
	}
	
	public void makeFrame() {
		
		
		/* The View in this program consists of 3 Components: a frame, a panel, and a label */

		// 1. Create a JFrame object and store it in a variable like this:
		//      JFrame frame = new JFrame();
	
		// 2. Set the frame to be visible

		// 3. Set the frame's default close operation to JFrame.EXIT_ON_CLOSE
		// This will make sure the program ends when you close the window

		// 4. Run the MyFirstSwingGuiRunner program. Do you see a window? 
		// It's probably very small because it is empty. Close the frame.

		// 5. Create a JPanel object and store it in a variable like this:
		//      JPanel panel = new JPanel();

		// 6. Create a JLabel object and store it in a variable

		// 7. Set the text of the JLabel to a lovely greeting.

		// 8. Tell the panel to add the label

		// 9. Tell the frame to add the panel

		// 10. Pack the frame.
		// This will make the frame big enough to show everything you just added to it

		// 11. Run MyFirstSwingGuiRunner again. Do you see your message? Close the frame.

		
		// 12. Set the icon of the label to the icon returned by the loadImage method (see below)

		// 13. Pack the frame again, because you increased the size of the label
		
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
