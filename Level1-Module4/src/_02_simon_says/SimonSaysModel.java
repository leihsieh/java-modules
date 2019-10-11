package _02_simon_says;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SimonSaysModel {
	private final int MAX_TRIES = 10;	
	private HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;

	private Random r = new Random();
	private boolean simonSays = false;
	

	// 1. Declare and initialize a points member variable to track the score.
int points = 0;	
	// 2. Declare and initialize a tries member variable to track how many attempts have been made.
int tries = 0;	
	
	
	private String rules = "Press the matching key when Simon says \n" + "otherwise press a different key";

	SimonSaysModel() {
		/*
		 * 3. Add four images that match keyboard arrow keys like this:
		 * 
		 * images.put(new Integer(KeyEvent.VK_UP), "up.jpg");
		 *
		 * You can use the images in the recipe package or find your own
		 * 
		 */
images.put(new Integer(KeyEvent.VK_UP), "up.jpg");
images.put(new Integer(KeyEvent.VK_DOWN), "down.jpg");
images.put(new Integer(KeyEvent.VK_LEFT), "left.jpg");
images.put(new Integer(KeyEvent.VK_RIGHT), "right.jpg");

	}

	
	public boolean keyIsCorrect(int keyCode) {
		
		// 4. increment the number of tries made
tries++;		
		// 5a. if the keyCode matches the imageIndex 
if (keyCode==imageIndex) {		
				// Increase the score if the Simon Says and return true 
if (simonSays) {points++; return true;}
else {points--; return false; }
}
				// Decrease the score if Simon did not say and return false
				// Make sure the score does not go below zero!
		
		// 5b. Do the opposite if they don't match
else {
	if (simonSays) {points--; return false; }
	else {points++; return true; }
}
	}
	
	public String getRules() {
		return rules;
	}

	public String userPrompt() {

		/*
		 * 4. Return "Simon says press this key" or "press this key" based on the 
		 * value of simonSays
		 */

if (simonSays) {
	return "Simon says press this key";
} else {
	return "press this key";
}
	}

	public boolean simonSays() {
		return simonSays;
	}
	
	
	//5. Make a method to return the score
	
	
	public boolean tooManyTries() {
		return tries==MAX_TRIES;
	}

	public Component getNextRandomImage() {
		imageIndex = new Random().nextInt(4) + 37;

		// 6. Use the Random object to set SimonSays to true or false
		// HINT: Random objects have a nextBoolean method
simonSays = r.nextBoolean();

		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	


}
