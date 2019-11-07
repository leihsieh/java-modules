package _07_drum_kit;


import java.applet.AudioClip;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class DrumKitModel {


	/** The model contains the images and sounds of a drum kit **/
	
	private Icon drumIcon;
	private Icon cymbalIcon;
	private AudioClip drumSound;
	private AudioClip cymbalSound;

	DrumKitModel() {

		/* 1  Download an image of a drum from the Internet. Drop it into the
		*       "drum_kit" package  or use the image we gave you 
		*/       
		
		// 2  Use the setDrumImage method to set the drum image into the DrumKit.	
	
	
		
		/* 3  Download an image of a cymbal from the Internet. Drop it into the
		*      "drum_kit" package (or use the image we gave you)
		*/      
		
		// 4  Use the setCymbalImage method to set the cymbal image into the DrumKit.
	


		/* 5  Download a drum sound and drop it into the "drum_kit" package.
		*       You can find it on freesound.org. To download it, log in as
		*       leagueofamazing (pw:code4life)  or use the sound we gave you
		*/        		
		
		// 6  Use the setDrumSound method to set the drum sound into the DrumKit 

		
		/* 7  Repeat Step 5 for a cymbal sound. 
		*       Use the setCymbalSound method to set the cymbal sound into the DrumKit
		*/       

		
	}

	
// The methods below convert image and sound files into image (Icon) and sound (AudioClip) objects
//  that the program can use. There should be no need to modify this code.	
	
	public void setDrumImage(String drumImageFile) {
		try {
			URL drumURL = getClass().getResource(drumImageFile);
			drumIcon = new ImageIcon(drumURL);
		} catch (Exception e) {
			drumIcon = null;
		}

	}
	public void setCymbalImage(String cymbalImageFile) {
		try {
			URL cymbalURL = getClass().getResource(cymbalImageFile);
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
