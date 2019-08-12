package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String starSign = JOptionPane.showInputDialog("What is your star sign?");
	if (starSign.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Tarus")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");
	}else if (starSign.equals("Pisces")) {
		JOptionPane.showMessageDialog(null, "Your horoscope for " + starSign + " says: .....");		
	}else {
		JOptionPane.showMessageDialog(null, "That isn't a star sign!");
	}
}
}
