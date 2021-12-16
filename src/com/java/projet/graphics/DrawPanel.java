package com.projet.java.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.projet.java.shapes.Shape;
import com.projet.java.Printer;
import com.projet.java.Screen;

public class DrawPanel extends JPanel implements Printer {
	private static final long serialVersionUID = 1L;
	
	private Shape data[][];
	
	public DrawPanel(Screen screen) {
		this.data = screen.getData();
		setBackground(Color.white);
	}

	public void draw() {
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int size = data.length;
		int cellWidth = getSize().width / size;
		int cellHeight = getSize().height / size;
		int width = cellWidth * size;
		int height = cellHeight * size;
		
		g.drawRect(0, 0, width - 1, height - 1);
		
		for (int i = 1; i < data.length; i++) {
			g.drawLine(cellWidth * i,  0, cellWidth * i, height - 1);
		}
		
		for (int i = 1; i < data.length; i++) {
			g.drawLine(0, cellHeight * i, width - 1, cellHeight * i);
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				int x = cellWidth * j;
				int y = cellHeight * i;
				if (data[i][j] == null) {
					g.setColor(Color.gray);
					g.fillRect(x + 1, y + 1, cellWidth - 2, cellHeight - 2);
				}
				else {
					data[i][j].setCellCoords(x, y, cellWidth, cellHeight);
					data[i][j].paint(g);
				}
			}
		}
		
	}
}
