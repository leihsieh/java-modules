package _09_sound_effects_machine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class SoundEffectsController  {
	
	// 1.  Make this class a MouseListener (Hint: Use implements MouseListener)

	// 2.  Let Eclipse assist you in adding the unimplemented methods that a MouseListener needs to have.
	//     When you have done this, you should see 5 new methods below. Find the one called mouseClicked.
	
	private SoundEffectsModel model;
	private SoundEffectsView view;
	
	SoundEffectsController(SoundEffectsView view) {	
		
		/* The controller acts as the go-between so needs to access the view and model */	
	
		this.view = view;
		model =  new SoundEffectsModel();
	}

	
	// 3. In the mouseClicked method, add code to get the button that the user clicked.
	//    Hint: you will need to find the source of the MouseEvent
	
	// 4. Use the text of the button to decide which sound to play (use the playSoundForButton method below)

	
	public void playSoundForLabel (JButton button) {

		// 5. Complete this method for all the sounds you have in your SoundEffectsModel
		
		
		if (button.getText().equals("Drum")) {
			
			model.getDrumSound().play();
		}

	}
}

