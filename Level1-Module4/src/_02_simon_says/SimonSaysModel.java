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

	private URL upArrow;
	private URL downArrow;
	private URL leftArrow;
	private URL rightArrow;
	private HashMap<Integer, Icon> images = new HashMap<Integer, Icon>();

	Random r = new Random();
	private boolean simonSays = false;

	// 1. Declare and initialize a score member variable

	// 2. Declare and initialize a tries member variable to track how many attempts
	// have been made

	private String rules = "Press the matching key when Simon says \n" + "otherwise press a different key";

	SimonSaysModel() {

		/*
		 * 3. Put four images that show keyboard arrow keys into the recipe package. You
		 * can use the images we gave you, or find your own and drag and drop them in
		 */

		// 4. Make a URL for each of the arrow images. The first one has been done for
		// you

		upArrow = getClass().getResource("up.jpg");

		// 5. Add each URL to the images collection - complete the code below for each
		// arrow
		images.put(new Integer(KeyEvent.VK_UP), new ImageIcon(upArrow));

	}

	public Icon getImageForKeyCode(int keyCode) {

		// 6. Use a Random object to set the model's SimonSays variable to true or false
		// HINT: Random objects have a nextBoolean method

		return images.get(keyCode);
	}	
	
	
	public boolean keyIsCorrect(int keyCode) {

		// 7. increment the number of tries made

		// 8. if the keyCode matches the imageIndex....

		// 		Check if "Simon said". If he did, increase the score  and return true

		// 		If "Simon did not say", decrease the score  and return false
		// 		Make sure the score does not go below zero!

		// 9. Do the opposite if the keyCode does not match the imageIndex

	}

	public String getRules() {
		return rules;
	}

	public String userPrompt() {

		/*
		 * 10. Change the line below to return the rules of Simon Says
		 */
		return "";
		
	}

	public boolean simonSays() {
		return simonSays;
	}

	// 11. Make a method to return the score

	public boolean tooManyTries() {

		// 12. Return true if they have had the maximum number of attempts
		// Hint: There is a MAX_TRIES value in the model

		return false;
	}




}
