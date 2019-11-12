package _05_whack_a_mole;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoleView {
	
	Random random = new Random();
	MoleController controller;
	JFrame frame = new JFrame();	
	
	MoleView() {
		controller = new MoleController(this);
		makeFrame();
	}
	
	private void makeFrame() {

		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(controller.numberOfHoles()/3,3));

		frame.add(panel);
		int moleHole = random.nextInt(controller.numberOfHoles());
		for (int i=0; i<controller.numberOfHoles(); i++) {
			JButton button = new JButton();
			if (i==moleHole) {
				button.setText("Mole");
			}
			button.addMouseListener(controller);
			panel.add(button);
		}
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
	
	public void gameOver() {
		frame.removeAll();
		frame.dispose();
	}
	
	public void newHole() {
		frame.dispose();
		frame = new JFrame();
		makeFrame();
	}
}
