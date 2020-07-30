package _01_double._2_test_scores;

import javax.swing.JOptionPane;
import java.util.*;

public class TestScores {

	public static void main(String[] args) {
		
		String score = JOptionPane.showInputDialog("What did you get on the test?");
		double scoreint = Double.parseDouble(score);
		
		if(scoreint>=94) {
			JOptionPane.showMessageDialog(null, "Wow! You must've studied pretty hard.");
		}
		else if(scoreint>=82 && scoreint<94) {
			JOptionPane.showMessageDialog(null, "Not bad, well done!");
		}
		else if(scoreint>=73 && scoreint<82) {
			JOptionPane.showMessageDialog(null, "Better luck next time");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wow, you really suck :)");
		}
		
	}
	
}
