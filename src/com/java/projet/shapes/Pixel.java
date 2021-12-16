package com.projet.java.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Pixel extends Shape {

	public Pixel() {
		setValue(1);
	}
	
	public Pixel(int x, int y) {
		super(x, y, 1);
	}

	public void paint(Graphics g) {		
		g.setColor(Color.magenta);
		g.fillOval(getX() + getWidth() / 2 - 5, getY() + getHeight() / 2 - 5, 10, 10);
	}

}
