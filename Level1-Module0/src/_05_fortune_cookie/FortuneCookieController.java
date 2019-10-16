package _05_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;

public class FortuneCookieController implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 int rand = new Random().nextInt(5);
		 System.out.println(rand);
		 if (rand==0)
		JOptionPane.showMessageDialog(null, "0");
	}

}
