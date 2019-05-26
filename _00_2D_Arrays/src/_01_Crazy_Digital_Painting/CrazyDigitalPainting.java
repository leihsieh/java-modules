package _01_Crazy_Digital_Painting;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CrazyDigitalPainting {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	private Color[][] colors = new Color[WIDTH][HEIGHT];
	
	public CrazyDigitalPainting() {
		for(int i = 0; i < WIDTH; i++) {
			for(int j = 0; j < HEIGHT; j++) {
				colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
			}
		}
		
		ColorArrayDisplayer.displayColorsAsImage(colors);
	}
	
	public static void main(String[] args) {
		new CrazyDigitalPainting();
	}
}
