package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String firstQuestion = JOptionPane.showInputDialog("Are You Happy?");
	if(firstQuestion.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}else if(firstQuestion.equals("No")) {
		String secondQuestion = JOptionPane.showInputDialog("Do you want to be happy?");
		if(secondQuestion.equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}else if(secondQuestion.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Change Something.");
		}
	}
}
}
