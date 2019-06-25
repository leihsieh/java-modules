package _01_houses;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static Robot r;
	public static void main(String[] args) {
		r = new Robot();
		r.penDown();
		//r.hide();
		r.setSpeed(50);
		r.setX(50);
		r.setY(550);
		String mode = JOptionPane.showInputDialog("Would you like night mode? ('yes' or 'no')");
		if(mode.equalsIgnoreCase("yes"))
			r.setWindowColor(Color.BLACK);
		for(int x = 0; x <10; x++) {
			String size = JOptionPane.showInputDialog("What size do you want your house to be? (small, medium or large):");
			String color = JOptionPane.showInputDialog("What color do you want your house to be?:");
			drawHouse(size,color);
		}
		
	}

	public static void drawHouse(String height, String color) {
		//there would be more conditions to accommodate more colors
		if(color.equalsIgnoreCase("blue"))
			r.setPenColor(Color.blue);
		if(color.equalsIgnoreCase("red"))
			r.setPenColor(Color.red);
		if(color.equalsIgnoreCase("green"))
			r.setPenColor(Color.green);
		int buildingHeight = 0;
		if(height.equalsIgnoreCase("small"))
			buildingHeight = 60;
		if(height.equalsIgnoreCase("medium"))
			buildingHeight = 120;
		if(height.equalsIgnoreCase("large"))
			buildingHeight = 250;
		r.move(buildingHeight);
		if(height.equals("large"))
			drawFlatRoof();
		else
			drawPointyRoof();
		r.move(buildingHeight);
		r.turn(270);
		r.setPenColor(Color.green);
		r.move(28);
		r.turn(270);
	}

	public static void drawPointyRoof() {
		r.turn(45);
		r.move(20);
		r.turn(90);
		r.move(20);
		r.turn(45);
	}

	public static void drawFlatRoof() {
		r.turn(90);
		r.move(28);
		r.turn(90);
	}
}
