package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class SoundEffectsModel {
	private AudioClip drumSound;
	
	
	
	SoundEffectsModel() {
		setDrumSound("drum.wav");
	}
	
	public void setDrumSound(String drumSoundFile) {
		drumSound = JApplet.newAudioClip(getClass().getResource(drumSoundFile));
	}
	public AudioClip getDrumSound() {
		return drumSound;
	}
}
