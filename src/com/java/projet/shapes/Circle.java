package com.projet.java.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	private int ray;
	
	public Circle() {
		setValue(10);
	}
	
	public Circle(int x, int y, int ray) {
		super(x, y);
		this.ray = ray;
		setValue(10);
	}
	
	public int getRay() {
		return ray;
	}
	
	public void setRay(int ray) {
		this.ray = ray;
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawOval(getX() + 5, getY() + 5, getWidth() - 10, getHeight() - 10);
	}

}
