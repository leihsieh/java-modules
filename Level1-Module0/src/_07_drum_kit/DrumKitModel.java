package _07_drum_kit;


import java.applet.AudioClip;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class DrumKitModel {


	private Icon drumIcon;
	private Icon cymbalIcon;
	private AudioClip drumSound;
	private AudioClip cymbalSound;

	DrumKitModel() {

		/* 2.1  Download an image of a drum from the Internet. Drop it into the
		*       Java project in the "_04_drum_kit" package  or use the image we gave you 
		*/       
		
		// 2.2  Use the setDrumImage method to set the drum image into the DrumKit.	
	
	
		
		/* 2.3  Download an image of a cymbal from the Internet. Drop it into the
		*      Java project in the "_04_drum_kit" package (or use the image we gave you)
		*/      
		
		// 2.4  Use the setCymbalImage method to set the cymbal image into the DrumKit.
		


		/* 2.5  Download a drum sound and drop it into the drum kit package.
		*       You can find it on freesound.org. To download it, log in as
		*       leagueofamazing (pw:code4life)  or use the sound we gave you
		*/        		
		
		// 2.6  Use the setDrumSound method to set the drum sound into the DrumKit 
	
		
		/* 2.7  Repeat Step 2.5 for a cymbal sound. 
		*       Use the setCymbalSound method to set the cymbal sound into the DrumKit
		*/       

		
	}

	public void setDrumImage(String drumImageFile) {
		try {
			URL drumURL = getClass().getResource(drumImageFile);
			drumIcon = new ImageIcon(drumURL);
		} catch (Exception e) {
			drumIcon = null;
		}
	}
	public void setCymbalImage(String cymbalFileName) {
		try {
			URL cymbalURL = getClass().getResource(cymbalFileName);
			cymbalIcon = new ImageIcon(cymbalURL);
		} catch (Exception e) {
			cymbalIcon = null;
		}
	}

	public void setDrumSound(String drumSoundFile) {
		drumSound = JApplet.newAudioClip(getClass().getResource(drumSoundFile));
	}
	public void setCymbalSound(String cymbalSoundFile) {
		cymbalSound = JApplet.newAudioClip(getClass().getResource(cymbalSoundFile));
	}
	
	
	public Icon getDrumIcon() {
		return drumIcon;
	}
	public Icon getCymbalIcon() {
		return cymbalIcon;
	}

	public AudioClip getDrumSound() {
		return drumSound;
	}
	public AudioClip getCymbalSound() {
		return cymbalSound;
	}

}
