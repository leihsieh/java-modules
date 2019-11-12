package _05_whack_a_mole;

import java.util.Date;

public class MoleModel {
	
	private final int WHACKS = 10;
	
	private int numberOfHoles = 24;
	private int numberOfWhacks = WHACKS;
	private int numberOfMoles = 10;

	private Date timeAtStart;
	private Date timeAtEnd;
	private int score = 0;
	
	public int numberOfHoles() {
		return numberOfHoles;
	}
	
	public boolean gameOver() {
		return numberOfWhacks==0;
	}
	
	public int molesWhacked () {
		return score;
	}
	
	public int molesMissed() {
		return numberOfMoles-score;
	}
	
	
	public void whacked() {
		whack();
		score++;
	}
	public void missed() {
		whack();
	}
	
	private void whack() {
		if (numberOfWhacks == WHACKS) {
			timeAtStart = new Date();
		}
		numberOfWhacks--;
		if (numberOfWhacks == 0) {
			timeAtEnd = new Date();
		}
	}
	
	public String whackRate() { 
	    return "Your whack rate is "+
	            ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / score)+
	            " moles per second.";
	}
}
