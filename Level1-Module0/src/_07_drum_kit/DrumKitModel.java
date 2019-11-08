package _07_drum_kit;


import java.applet.AudioClip;
import javax.swing.Icon;


public class DrumKitModel {


	/** The model contains the images and sounds of a drum kit that has a drum and cymbal **/
	
	private DrumKitItem drum;
	private DrumKitItem cymbal;
	

	DrumKitModel() {

		/* 1  Download an image of a drum from the Internet. Drop it into the
		*       "drum_kit" package  or use the image we gave you (snare.jpg) 
		* 
		*     Download a drum sound and drop it into the "drum_kit" package.
		*       You can find it on freesound.org. To download it, log in as
		*       leagueofamazing (pw:code4life)  or use the sound we gave you (drum.wav)
		*/ 		
		
		
		// 2  Make a drum for the drum kit. 
		//    Use the code below, but make sure the names of the files match those from step 1.
	
		drum = new DrumKitItem("snare.jpg", "drum.wav");
		
		
		// 3   Repeat steps 1 and 2 for a cymbal
		  
		
	}
	
	
	public Icon getDrumIcon() {
		return drum.getImage();
	}
	public AudioClip getDrumSound() {
		return drum.getSound();
	}
	
	public Icon getCymbalIcon() {
		return cymbal.getImage();
	}
	public AudioClip getCymbalSound() {
		return cymbal.getSound();
	}

}