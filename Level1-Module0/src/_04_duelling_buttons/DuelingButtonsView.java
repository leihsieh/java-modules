package _04_duelling_buttons;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtonsView {
	
	DuelingButtonsController controller;
	
	private JFrame frame;
	private JPanel panel;
	private JButton leftButton;
	private JButton rightButton;

	private Dimension BIG = new Dimension(400, 400);
	private Dimension SMALL = new Dimension(200, 200);
	
	
	DuelingButtonsView() {
		controller  = new DuelingButtonsController(this);
		makeFrame();
	}
	
	private void makeFrame() {

		/* The view consists of 4 components: a frame, a panel, and two buttons */
		
		frame = new JFrame();
		panel = new JPanel();
		leftButton = new JButton();
		rightButton = new JButton();
		
		// 1. Add the panel to the frame

		// 2. Make the frame visible and setDefaultCloseOperation to JFrame.EXIT_ON_CLOSE

		// 3. Set the text of the leftButton to "Click me!"

		// 4. Set the text of the rightButton to "Click me!"

		// 5. Add the buttons to the panel

		// 6. Pack the frame

		// 7. Set the title of the frame to "Dueling Buttons"

		// 8. Complete the code in the makeSmall and makeBig methods below

		// 9. Run the program. Does the frame appear with 2 buttons?
		// Click the buttons. What happens? 
		

		
		// 10. Add an action listener to each button (hint: the controller is an action listener) 



		// 11. Run the program again and click on the buttons. 

	}
	
	public void makeSmall(JButton button) {
		
		// 8.1 Set the text of the button to "Click Me!"

		// 8.2 Set the PREFERRED size of the button to SMALL


		// 8.3 Make the OTHER button big (use the makeBig method)


		// 8.4 Pack the frame so the new sizes are shown

	}
	private void makeBig(JButton button) {
		
		// 8.5 Set the text of the button to "No, click Me!"

		// 8.6 Set the PREFERRED size of the button to BIG

	}
}
