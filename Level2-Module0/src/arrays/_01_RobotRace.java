package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setX(100 + i * 175);
			robots[i].setY(300);
			robots[i].setSpeed(10);
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean notFinished = true;
		while (notFinished) {
			for (int i = 0; i < robots.length; i++) {
				// 5. use another for loop to iterate through the array and make each robot move
				// a random amount less than 50.
				if (notFinished) {
					robots[i].move(rand.nextInt(50));
					if (robots[i].getY() < 10) {
						// 7. declare that robot the winner and throw it a party!
						notFinished = false;
						System.out.println("Robot " + (i + 1) + " is the winner!");
					}
				}

			}
		}

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}

}
