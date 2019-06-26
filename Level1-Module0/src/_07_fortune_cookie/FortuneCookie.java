package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class FortuneCookie implements ActionListener{
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton button = new JButton("Click for a fortune!");
	    frame.add(button);
	    button.addActionListener((ActionListener)this);
	    frame.pack();
		//System.out.println("Button clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int random = new Random().nextInt(5);
		if(random == 0)
			JOptionPane.showMessageDialog(null, "You will achieve a state of great affluence soon.");
		if(random == 1)
			JOptionPane.showMessageDialog(null, "A beautiful, smart, and loving person will be coming into your life.");
		if(random == 2)
			JOptionPane.showMessageDialog(null, "A faithful friend is a strong defense.");
		if(random == 3)
			JOptionPane.showMessageDialog(null, "A fresh start will put you on your way.");
		if(random == 4)
			JOptionPane.showMessageDialog(null, "A lifetime of happiness lies ahead of you.");
		
	}
}
