package _08_body_part_quiz;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class BodyPartQuizModel {
	
	// You can use the celebrity photos we have placed in the program's 
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the _05_body_part_quiz package, and change the names below.

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
		/* The quiz has a list of images of celebrities to identify */
		initializeImageList();
	
	}

	public Icon getNextImage() {

		if (nextQuestion < imageList.size()) {
			return imageList.get(nextQuestion);
		}
		return null;
	}

	private void increaseScore() {
		//2. Increase the score

	}
	
	public int getScore() {
		//3. Change this code to return the value of the score

		return 0;
	}
	
	public boolean isCorrectAnswer(String guess) {
		
		Boolean correct = guess.equalsIgnoreCase(answers.get(nextQuestion));
	
		// 4. If they got it right, increase the score

		
		/* sets the next question and returns true if the player guessed correctly, false if not */
		nextQuestion++;
		return correct;
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
