package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "I know that you went fishing last summer, "+name+"!");
}
}
