package _03_jeopardy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JeopardyController  implements ActionListener{

	
	private JeopardyModel model;
	private JeopardyView view;
	
	JeopardyController(JeopardyModel model, JeopardyView view) {
		this.model  = model;
		this.view = view;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			
			JButton buttonPressed = (JButton) e.getSource();	
			
		// Send the text of the button to the model to ask the right question	
model.askQuestionForAmount(buttonPressed.getText());
		// Tell the view to update the score	
view.updateScore();

			// Clear the text on the button that was pressed (set the button text to nothing)
buttonPressed.setText("");
		
		
	}
	
	
}
