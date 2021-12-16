package com.projet.java.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends Shape {
	private int x2, y2, x3, y3;
	
	public Triangle() {
		setValue(8);
	}
	
	public Triangle(int x, int y, int x2, int y2, int x3, int y3) {
		super(x, y, 8);
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
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

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public void paint(Graphics g) {		
		int x1 = getX() + getWidth() / 2;
		int y1 = getY() + 5;
		
		x2 = getX() + 5;
		y2 = getY() + getHeight() - 5;
		
		x3 = getX() + getWidth() - 5;
		y3 = y2;
		
		g.setColor(Color.cyan);
		
		g.fillPolygon(new Polygon(new int[] {x1, x2, x3}, new int[] {y1, y2, y3}, 3));
	}   
}
