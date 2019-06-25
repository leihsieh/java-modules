package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
//Obviously, this would be tailored to each unique class

		// 1. Save something remarkable about each person in a variable.
		String billy = "Billy is a world champion Rock Climber!";
		String mia = "Mia enjoys cooking with her mom!";
		String joseph = "Joseph owns three different bikes!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane
				.showInputDialog("Enter the name of a classmate to find out something remarkable about that person:");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (name.equalsIgnoreCase("billy")) {
			JOptionPane.showMessageDialog(null, billy);
		}
		if (name.equalsIgnoreCase("mia")) {
			JOptionPane.showMessageDialog(null, mia);
		}
		if (name.equalsIgnoreCase("joseph")) {
			JOptionPane.showMessageDialog(null, joseph);
		}

	}
}
