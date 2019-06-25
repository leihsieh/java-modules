package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.penDown();
		r.setSpeed(50);
		r.hide();
		//example first letter ("K")
		r.move(100);
		r.turn(180);
		r.move(50);
		r.turn(-45);
		r.move(75);
		r.turn(180);
		r.move(75);
		r.turn(90);
		r.move(75);
	}
}
