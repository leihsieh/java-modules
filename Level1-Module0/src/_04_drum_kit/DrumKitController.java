package _04_drum_kit;

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class DrumKitController implements MouseListener {


	DrumKitView view;
	DrumKitModel model;

	public DrumKitController(DrumKitView view, DrumKitModel model) {
		this.view = view;
		this.model = model;
	}


	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		/* 3.1 Print "mouse clicked" to the console. Run your program and watch
		*      the console to see if it works
		*/

		// This line gets the label that the mouse clicked on
		JLabel labelClicked = (JLabel) e.getSource(); 


		// 3.2 Get the view to play the sound that goes with the label that was clicked


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
