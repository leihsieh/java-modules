package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is your birthday? (mm/dd format, please!)");
		// insert correct date below
		String todaysDate = "06/25";
		if (birthday.equals(todaysDate)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!!!!");
		} else
			JOptionPane.showMessageDialog(null, "Have a very merry unbirthday!");
	}
}
