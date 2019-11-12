package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChuckleClicker {
	
private ChuckleController controller;	

private JFrame frame ;
private JPanel panel = new JPanel();
private JLabel display = new JLabel("start");

public JButton jokeButton = new JButton("joke");
public JButton punchButton = new JButton("punchline");

	ChuckleClicker() {
		controller = new ChuckleController(this);
		makeFrame();

	}

	private void makeFrame() {
		frame=new JFrame();
		panel.add(jokeButton);
		panel.add(punchButton);
		panel.add(display);
		jokeButton.addMouseListener(controller);
		punchButton.addMouseListener(controller);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeLabel("");
	}
	
	public void changeLabel(String text) {
		display.setText(text);
		frame.pack();
	}
}
