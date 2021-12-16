package com.projet.java.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
	private int size;
	
	public Square() {
		setValue(5);
	}

	public Square(int x, int y, int size) {
		super(x, y, 5);
		this.size = size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX() + 5, getY() + 5, getWidth() - 10, getHeight() - 10);
	}

}
