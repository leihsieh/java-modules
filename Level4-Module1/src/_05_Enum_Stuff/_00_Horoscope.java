package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	// all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		printZodiac(Zodiac.AQUARIUS);
	}
	
	public static void printZodiac(Zodiac sign) {
		switch(sign) {
		case ARIES: {
			JOptionPane.showMessageDialog(null, "You're gonna have a good day");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "You're gonna have a bad day");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "You're gonna have an okay day");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "You're gonna be fine");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null, "You're gonna be cool");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "You're gonna survive");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "You're gonna do a kickflip");
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "You're gonna do a backflip");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "You're gonna dance");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "You're gonna laugh");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null, "You're gonna jump");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(null, "You're gonna party");
			break;
		}
		
		}
	}
}
