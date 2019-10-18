package _06_book_of_illusions;


import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BookOfIllusionsModel {
	
	/** The model contains a collection of cool optical illusions. **/
	
	private ArrayList<Icon> illusions = new ArrayList<Icon>();
	private int imageIndex = 0;
	
	
	BookOfIllusionsModel () {
		
		// 1. Change the file paths below to provide your own illusions
		
		illusions.add( loadImage ( "src/_02_simon_says/up.jpg" ));
		illusions.add( loadImage ( "src/_02_simon_says/down.jpg" ));
		illusions.add( loadImage ( "src/_07_fortune_teller/fortune teller.png"));
		illusions.add( loadImage ( "src/_02_simon_says/left.jpg" ));
		illusions.add( loadImage ( "src/_02_simon_says/right.jpg" ));

	}

	
	// There should be no need to modify the following code
	
	public Icon getNextIllusion() {

		/* returns null if there are no more illusions */
	
		Icon illusion = null;
		if (imageIndex < illusions.size()) {
			illusion = illusions.get(imageIndex);
			imageIndex++;
		}
		return illusion;
	}
	
	private Icon loadImage(String fileName) {
		return new ImageIcon(fileName);
	}
	
}
