package _05_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookieView {

	private FortuneCookieController controller = new FortuneCookieController();
	private JFrame frame = new JFrame();
	private JButton button = new JButton("This is a button");
	
	public void showButton() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		button.addActionListener(controller);
		frame.pack();
        System.out.println("Button clicked");
   }
}
