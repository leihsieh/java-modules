package _14_intro_to_parseint;

import javax.swing.JOptionPane;

public class IntroToParseIntPartB {

	public static void main(String[] args) {
		
		/* 1) Ask the user to enter their height in inches and set it to the myHeight variable */
		String myHeight = JOptionPane.showInputDialog("Enter height in inches to ride the LEGO TECHNIC Coaster");
		
		// Uncomment the line below
		//if( myHeight > 42 ) { }
		
		//Do you see the height > 42 underlined red? That because we are comparing a string with and int. 
		/* 2) Convert your string variable to an int variable using Integer.parseInt(* your string variable *);  Hint: int height */
		
		int height = Integer.parseInt(myHeight);
		
		/* 3) Check if height of the users is greater than 42 inches to ride the LEGO TECHNIC coaster (Output the answer using JOption) */
		
		if ( height > 42 ) {
			JOptionPane.showMessageDialog(null, "You can ride the Lego Technic Coaster!");
		}
		
		/* 4) Check if the height of the user is greater than 48 inches to see if the user can ride the game alone (Output the answer using JOption) */
		
		if ( height > 48 ) {
			JOptionPane.showMessageDialog(null, "You also can ride the game by yourself!");
		}
		
	}

} 
