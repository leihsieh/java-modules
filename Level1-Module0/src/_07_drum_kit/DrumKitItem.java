package _07_drum_kit;

import java.applet.AudioClip;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class DrumKitItem {
	
	private Icon image;
	private AudioClip sound;
	
	
	DrumKitItem(String imageFileName, String soundFileName) {
		setImage(imageFileName);
		setSound(soundFileName);
	}

	public void setImage(String drumImageFile) {
		try {
			URL drumURL = getClass().getResource(drumImageFile);
			image = new ImageIcon(drumURL);
		} catch (Exception e) {
		}
	}

	public void setSound(String drumSoundFile) {
		sound = JApplet.newAudioClip(getClass().getResource(drumSoundFile));
	}

	public Icon getImage() {
		return image;
	}
	public AudioClip getSound() {
		return sound;
	}
	
	
}
