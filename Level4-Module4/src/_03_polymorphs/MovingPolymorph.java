package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{
	int circleCounter = 0;

	MovingPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(){
		
		setX((int)(getX()+Math.cos(circleCounter)*100.0));
		setY((int)(getY()+Math.sin(circleCounter)*100.0));
		
		circleCounter++;
		
	}
}
