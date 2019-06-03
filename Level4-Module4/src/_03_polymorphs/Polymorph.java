package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width = 50;
    private int height = 50;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
