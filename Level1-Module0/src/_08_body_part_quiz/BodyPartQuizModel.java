package _08_body_part_quiz;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class BodyPartQuizModel {
	
	/* You can use the celebrity photos we have placed in the program's
	 *  package,or if you prefer, get celebrity photos from the Internet,
	 *   place them in the _05_body_part_quiz package, and change the names below.
	 */
	 
	// IF YOU CHANGE THE PICTURES, YOU MUST ALSO CHANGE THE ANSWERS!!

	private String firstImage = "src/_07_body_part_quiz/arnold.jpeg";
	private String secondImage = "src/_07_body_part_quiz/leonardo.jpeg";
	private String thirdImage = "src/_07_body_part_quiz/morgan.jpeg";
	private String fourthImage = "src/_07_body_part_quiz/jack.jpeg";
	
	private String firstAnswer = "Arnold";
	private String secondAnswer = "Leonardo";
	private String thirdAnswer = "Morgan";
	private String fourthAnswer = "Jack";
	
	private ArrayList<Icon> imageList = new ArrayList<Icon>();
	private ArrayList<String> answers = new ArrayList<String>();

	private int nextQuestion = 0;
	

	// 1. Make a private variable to hold the score.

	
	
	public BodyPartQuizModel() {
		/* The quiz has a list of images of celebrities to identify (see above) */
		initializeImageList();
	
	}

	private void increaseScore() {
		//2. Increase the score

	}
	
	public int getScore() {
		//3. Return the score

		return 0;
	}
	
	
	
	 /*      You should not have to change any of the code below here   */
	
	public boolean isCorrectAnswer(String guess) {
	
		 /* Check if the player got the correct answer. 
		  * Adjust the score, if necessary, and set the next question.
		  * Return true if they got it right, false if they did not. */

		Boolean correct = guess.equalsIgnoreCase(answers.get(nextQuestion));
		
		if (correct) {
			increaseScore();
		}

		nextQuestion++;
		return correct;
	}

	public Icon getNextImage() {
		if (nextQuestion < imageList.size()) {
			return imageList.get(nextQuestion);
		}
		return null;
	}
	
	private void initializeImageList() {
		imageList.add(loadImage(firstImage));
		imageList.add(loadImage(secondImage));
		imageList.add(loadImage(thirdImage));
		imageList.add(loadImage(fourthImage));
		
		answers.add(firstAnswer);
		answers.add(secondAnswer);
		answers.add(thirdAnswer);
		answers.add(fourthAnswer);
	}
	
	private Icon loadImage(String fileName) {
		return new ImageIcon(fileName);
	}

}
