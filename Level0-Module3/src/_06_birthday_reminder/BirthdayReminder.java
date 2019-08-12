
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String person = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(person);
		if (person.equals("mom")) {
			// 4. if user asked for "mom"
			// print mom's birthday
			System.out.println(momsBirthday);
		} else if (person.equals("dad")) {
			// 5. if user asked for "dad"
			// print dad's birthday
			System.out.println(dadsBirthday);
		} else if (person.equals("myself")) {
			// 6. if user asked for your name
			// print myBirthday
			System.out.println(myBirthday);
		} else {
			// 7. otherwise print "Sorry, i don't remember that person's birthday!"
			System.out.println("Sorry, I don't remeber that person's birthday!");
		}
	}
}
