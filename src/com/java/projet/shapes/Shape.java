package com.projet.java.shapes;

import java.awt.Graphics;

abstract public class Shape {
	private int x, y, value;
	private int width, height;
	
	public Shape() {
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Shape(int x, int y, int value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	abstract public void paint(Graphics g);

	public String toString() {
		return "" + value;
	}
	
	public void setCellCoords(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
