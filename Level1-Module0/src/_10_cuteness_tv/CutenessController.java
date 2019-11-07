package _10_cuteness_tv;

import java.io.IOException;
import java.net.URI;

public class CutenessController {

	// 1.  Make your CutenessController class a MouseListener (Hint: Use implements MouseListener)

	// 2.  Let Eclipse assist you in adding the unimplemented methods that a MouseListener needs to have.
	//     When you have done this, you should see 5 new methods below. One will be called mouseClicked.
	
	CutenessTV view;
	
	// 3. Create a CutenessModel variable. 
	
	CutenessController(CutenessTV view) {
		
		/* The controller acts as the go-between so needs to access the view and model */	
	
		this.view = view;
		
		// 4. Initialize the model variable    Hint: new CutenessModel() 	
		 
	}	
	
	// 5. If you completed steps 1 and 2 correctly there will be a mouseClicked method in this class.
	//    Add the following to the mouseClicked method...
	
			// 5a. add code to get the button that the user clicked.
			//    Hint: you will need to "get the source" of the MouseEvent
	
 
			// 5b. Use the text of the button to choose which video to get
			//    then call the playVideoForButton method below.
	
	
    private void playVideoForButton(String buttonText) {
    	
    	// 	The model has all the video information.
    	//  Make sure you complete the CutenessModel class before doing this bit.  
    		
    	// 6. Get the right video URI based on the button text
    	//  	ex. If the button text is "Duck" get the duck video URI from the model

    	
    	// 7. Call the playVideo method below, passing it the URI of the video
    	
    	
    }
    
	private void playVideo(URI uri) {
		try {
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
