package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class SoundEffectsModel {
	
	
	// 1. Add a variable for each of the sounds in your sound effects machine
	
	private AudioClip drumSound;
	
	
	SoundEffectsModel() {
		
		// 3. Add code here to initialize all the variables above with AudioClips
		
		setDrumSound("drum.wav");
	}

	// 2. Make copies of the following 2 methods for each of your sound effects
	
	public void setDrumSound(String drumSoundFile) {
		drumSound = JApplet.newAudioClip(getClass().getResource(drumSoundFile));
	}
	public AudioClip getDrumSound() {
		return drumSound;
	}
}
