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
	

	// 1. Declare and initialize a score member variable

	// 2. Declare and initialize a tries member variable to track how many attempts have been made
	
	
	
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

		

	}

	
	public boolean keyIsCorrect(int keyCode) {
		
		// 4. increment the number of tries made
	
		// 5a. if the keyCode matches the imageIndex 
	
				// Increase the score if the Simon Says and return true 

				// Decrease the score if Simon did not say and return false
				// Make sure the score does not go below zero!
		
		// 5b. Do the opposite if they don't match


	}
	
	public String getRules() {
		return rules;
	}

	public String userPrompt() {

		/*
		 * 4. Return "Simon says press this key" or just  "press this key" based on the 
		 *     value of simonSays
		 */


	}

	public boolean simonSays() {
		return simonSays;
	}
	
	
	//5. Make a method to return the score
	
	
	public boolean tooManyTries() {
		
		// 6. Return true if they have had the maximum number of attempts
		// Hint: There is a MAX_TRIES value in the model
		
		return false;
	}

	public Component getNextRandomImage() {
		imageIndex = new Random().nextInt(4) + 37;

		// 7. Use the Random object to set SimonSays to true or false
		// HINT: Random objects have a nextBoolean method


		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	


}
