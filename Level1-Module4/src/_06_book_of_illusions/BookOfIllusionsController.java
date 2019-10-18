package _06_book_of_illusions;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;

public class BookOfIllusionsController extends MouseAdapter {
	
	private BookOfIllusionsView view;
	private BookOfIllusionsModel model;

	BookOfIllusionsController(BookOfIllusionsView view) {
		
		/* The controller acts as the go-between so needs to access the view and model */
		
		this.view = view;
		model = new BookOfIllusionsModel();
		
	}
	
	/* Because this class extends MouseAdaptor, we only need to implement the listener methods
	 * we plan to use. In this case, the mousePressed method.
	 */
	
	public void mousePressed(MouseEvent e) {
		
		// 1. Print "clicked!" to the console when the mouse is pressed
		//    Run the program to  make sure it works. Then you can remove the print statement.
		
		// 2. ** Put your own picture files into the BookOfIllusionsModel **
		
		// 3. Get the next illusion from the model
	
		// 4. Tell the view to show the illusion

	}
	
	
}
