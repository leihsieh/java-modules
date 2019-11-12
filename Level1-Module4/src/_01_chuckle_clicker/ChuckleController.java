package _01_chuckle_clicker;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class ChuckleController implements MouseListener {

	private ChuckleModel model = new ChuckleModel();
	private ChuckleClicker view;
	
	ChuckleController (ChuckleClicker view) {
		this.view = view;
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();

		if (button==view.jokeButton) {
			view.changeLabel(model.getJoke());
		}
		else if (button == view.punchButton) {
			view.changeLabel(model.getPunchline());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
