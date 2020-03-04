package _14_intro_to_parseint;

import javax.swing.JOptionPane;

public class IntroToParseIntPartA {

	public static void main(String[] args) {
		
		/* 1) Ask the user to enter number 4 and hold it in a variable */
		String firstValue = JOptionPane.showInputDialog("Enter number 4");
		
		/* 2) Ask the user to enter number 6 and hold it in a second variable */
		String secondValue = JOptionPane.showInputDialog("Enter number 6");  
		
		/* 3) Output the addition of the first variable and the second variable */
		JOptionPane.showMessageDialog(null, firstValue + secondValue );
		
		// Did you notice 46 instead of 4 + 6 = 10?
		
		/* 4) Ask the user to enter number 5 and hold it in a third variable */
		String thirdValue = JOptionPane.showInputDialog("Enter number 5");
		
		/* 5) Output the addition of the first, second, and third variable */
		JOptionPane.showMessageDialog(null, firstValue + secondValue + thirdValue); 
		
		//Did you notice 456 instead of 4 + 6 + 5 = 15?
		
		// Pass you first variable inside the parenthesis of --> Integer.parseInt( *your first variable *);
		// and set it equal to an int variable. For example: int first = Integer.parseInt(*your first variable *);
		
		int first = Integer.parseInt(firstValue);
		
		/* 6) Do the same for your second variable. For example int second = Integer.parseInt(*your second variable*); */
		
		int second = Integer.parseInt(secondValue);
		
		/* 7) Output the addition of your new integer variables */
		
		JOptionPane.showMessageDialog(null, first + second);
		
		// Did you notice the value 10? If so, hurray! You just change the type of your variable from String to int.
		// if not, as your teacher for help
		
		/* 8) Convert your third variable (String) to an integer(int) using Integer.parseInt(*your third variable*);  */ 
		int third = Integer.parseInt(thirdValue); 
		
		/* 9) Output the addition of your three int variables */
		JOptionPane.showMessageDialog(null, first + second + third);
		
		// Did your value 15 instead of 465?
		
	}

}
