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

	private Random r = new Random();
	private int imageKeyCode;
	
	private String rules = "Press the matching key when Simon says \n" + "otherwise press a different key";
	
	private boolean simonSays = false;

	
	// 1. Declare and initialize a "score" member variable

	// 2. Declare and initialize a "tries" member variable to track how many times
	//    the player has pressed a key


	SimonSaysModel() {

		/*
		 * 3. Put four images that show keyboard arrow keys into the recipe package. You
		 * can use the images we gave you, or find your own and drag and drop them in
		 */

		// 4. Make a URL for each of the arrow images. The first one has been done for
		// you (copy, paste, and change it for the others).

		upArrow = getClass().getResource("up.jpg");


		// 5. Add each URL to the images collection - complete the code below for each
		// arrow. The first one has been done for you (copy, paste, and change it for the others).
		
		images.put(new Integer(KeyEvent.VK_UP), new ImageIcon(upArrow));

	}

	public Icon getNextKeyImage() {
		
		//This method chooses what picture the player sees next.
		
		// This code uses a Random object to get one of 4 arrow keyCodes
		int imageKeyCode = r.nextInt(4) + 37;

		// 6. Use the same Random object as above to set the SimonSays variable to true or false
		// HINT: Random objects have a nextBoolean method

		
		// Return the image that goes with the keyCode. You do not have to change this.
		return images.get(imageKeyCode);
	}	
	
	
	public boolean keyIsCorrect(int playerKey) {

		// 7. increment the number of tries made (see step 2)

		// 8. if the playerKey is the same as the imageKeyCode, 
		//    the player pressed the arrow key that matched the picture

				// 	First check if "Simon said". If he did, increase the score  and return true
		
				// 	If "Simon did not say", decrease the score  and return false
				// 	Make sure the score does not go below zero!

			
		// 9. Now do the opposite if the keyCode is not the same as the imageIndex

		
	}

	
	public String getRules() {
		return rules;
	}

	public boolean simonSays() {
		return simonSays;
	}

	// 10. Make a method to return the score


	public boolean tooManyTries() {

		// 11. Return true if they have had the maximum number of attempts
		// Hint: There is a MAX_TRIES value in the model

		return false;
	}




}
