package _05_body_part_quiz;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BodyPartQuizModel {
	
	// You can use the celebrity photos we have placed in the program's 
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the _05_body_part_quiz package, and change the names below.

	String firstImage = "src/_05_body_part_quiz/arnold.jpeg";
	String secondImage = "src/_05_body_part_quiz/leonardo.jpeg";
	String thirdImage = "src/_05_body_part_quiz/morgan.jpeg";
	String fourthImage = "src/_05_body_part_quiz/jack.jpeg";
	
	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	public BodyPartQuizModel() {
		initializeImageList();
		imageIterator = imageList.iterator();
	}


	private void initializeImageList() {
		imageList.add(loadImage(firstImage));
		imageList.add(loadImage(secondImage));
		imageList.add(loadImage(thirdImage));
		imageList.add(loadImage(fourthImage));
	}
	

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}


	public JLabel getNextImage() {

		if (imageIterator.hasNext())
			return imageIterator.next();
		return null;
	}
}
