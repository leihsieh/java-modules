package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph{

	MousePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(){
		
	}
	
	
}
