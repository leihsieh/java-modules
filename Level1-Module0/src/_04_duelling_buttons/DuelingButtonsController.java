package _04_duelling_buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DuelingButtonsController implements ActionListener {
	
	private DuelingButtonsView view;
	
	DuelingButtonsController(DuelingButtonsView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) e.getSource();	// This line gets the button
													// that the mouse clicked on

		// Whichever button was pressed, tell the view to make it small

		view.makeSmall(buttonPressed);
	
	}


	
}
