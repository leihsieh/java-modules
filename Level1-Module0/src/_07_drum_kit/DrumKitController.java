package _07_drum_kit;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;

public class DrumKitController implements MouseListener {


	DrumKitView view;
	DrumKitModel model;

	public DrumKitController(DrumKitView view) {
		
		/* The controller acts as the go-between so needs to access the view and model */	
		
		this.view = view;
		model =  new DrumKitModel();
	}

	public Icon getDrumImage() {
		
		// 1. return the icon of the drum image
		

	}
	
	public Icon getCymbalImage() {
		
		// 2. return the icon of the cymbal image
		

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		/* 3.1 Print "mouse clicked" to the console. Run your program and watch
		*      the console to see if it works
		*/

		// This line gets the label that the mouse clicked on
		JLabel labelClicked = (JLabel) e.getSource(); 


		// 3.2 Play the sound that goes with the label that was clicked (use method below)


	}	
	
	// This method will play the drum kit sounds from the model
	
	public void playSoundForLabel (JLabel label) {

		if (label.getIcon() == model.getDrumIcon()) {
			System.out.println("Drum");
			model.getDrumSound().play();
		}

		else if (label.getIcon() == model.getCymbalIcon()) {
			System.out.println("Cymbal");
			model.getCymbalSound().play();
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
