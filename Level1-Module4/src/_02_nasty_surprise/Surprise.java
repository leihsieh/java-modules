package _02_nasty_surprise;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Surprise {

 private SurpriseController controller;
		 JLabel picture = new JLabel();
		 JFrame frame = new JFrame();
 	 JButton trick = new JButton ("Trick");
	 JButton treat = new JButton ("Treat");
	 
	 Surprise() {
	 controller = new SurpriseController(this);
	 makeFrame();
 }
 
 
 private void makeFrame() {

	 JPanel panel = new JPanel();


	 panel.add(trick);
	 panel.add(treat);
	 panel.add(picture);
	 frame.add(panel);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.pack();
	 trick.addMouseListener(controller);
	 treat.addMouseListener(controller);
 }
 
 public void changePicture(Icon icon) {
picture.setIcon(icon);
frame.pack();
 }
 
}
