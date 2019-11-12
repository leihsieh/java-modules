package _05_whack_a_mole;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MoleController extends MouseAdapter {
	private MoleView view;
	private MoleModel model = new MoleModel();

	int molesWhacked = 0;

	MoleController(MoleView view) {
		this.view = view;
	}

	public int numberOfHoles() {
		return model.numberOfHoles();
	}

	public void mouseClicked(MouseEvent e) {
		
		JButton button = (JButton) e.getSource();

		if (button.getText().equals("Mole")) {
			model.whacked();
			speak ("ouch");
		} else {
			model.missed();
			speak("missed");
		}
		if (model.gameOver()) {
			view.gameOver();
			JOptionPane.showMessageDialog(null, " You Missed: " + model.molesMissed()+ " moles");
			JOptionPane.showMessageDialog(null, model.whackRate());
			System.exit(0);
		} else {
			view.newHole();
		}
	}

	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
