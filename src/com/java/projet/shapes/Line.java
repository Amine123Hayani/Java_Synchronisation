package com.projet.java.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {
	private int x2, y2;
	
	public Line() {
		setValue(2);
	}
	
	public Line(int x, int y, int x2, int y2) {
		super(x, y, 2);
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawLine(getX() + 5, getY() + 5, getX() + getWidth() - 5, getY() + getHeight() - 5);
		g.drawLine(getX() + 5, getY() + 6, getX() + getWidth() - 5, getY() + getHeight() - 4);
	}

}
