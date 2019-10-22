package _10_cuteness_tv;

import java.io.IOException;
import java.net.URI;

public class CutenessController {

	// 1.  Make your CutenessController class a MouseListener (Hint: Use implements MouseListener)

	// 2.  Let Eclipse assist you in adding the unimplemented methods that a MouseListener needs to have.
	//     When you have done this, you should see 5 new methods below. Find the one called mouseClicked.
	
	CutenessView view;
	
	CutenessController(CutenessView view) {
		
		/* The controller acts as the go-between so needs to access the view and model */	
	
		this.view = view;
		
		// 3. Create a CutenessModel member variable. Initialize it here Hint: new CutenessModel() 
 
		// 4. Complete the CutenessModel class with videos for all the buttons.			
		 
	}	
	
	//In the mouseClicked method (should have been created in step 2): 
	
			// 5. add code to get the button that the user clicked.
			//    Hint: you will need to get the source of the MouseEvent
	
 
			// 6. Use the text of the button to choose which video to get
			//    and call the getVideoForButton method below.
	
	
    private void getVideoForButton(String buttonText) {
    	
    	// 7. Get the URI of the video based on the value of the button text
    	//  	ex. If the button text is "Duck" get the duck video
    	// 	  Hint: The model has all the video information.
    	
    	// 8. Call the playVideo method below passing it the URI
    	
    	
    }
    
	private void playVideo(URI uri) {
		try {
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
