package _09_sound_effects_machine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class SoundEffectsController implements MouseListener {

	SoundEffectsModel model;
	SoundEffectsView view;
	
	SoundEffectsController(SoundEffectsView view) {	
	/* The controller acts as the go-between so needs to access the view and model */	
	
	this.view = view;
	model =  new SoundEffectsModel();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton labelClicked = (JButton) e.getSource(); 
		System.out.println(labelClicked.getText());
		if (labelClicked.getText().equals("Drum")) {
			model.getDrumSound().play();
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
