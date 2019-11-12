package _02_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class SurpriseController implements MouseListener {
private Surprise view;
private SurpriseModel model;

SurpriseController (Surprise view) {
	model = new SurpriseModel();
	this.view = view;
}

	
	@Override
	public void mouseClicked(MouseEvent e) {
JButton button = (JButton) e.getSource();
if (button==view.treat) {
	view.changePicture(model.getTreatIcon());
}
if (button==view.trick) {
	view.changePicture(model.getTrickIcon());
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
