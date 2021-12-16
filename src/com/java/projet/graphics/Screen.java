package com.java.projet.graphics;

import com.esisa.java.revision.shapes.Shape;

public class Screen {
	private Shape data[][];
	private int size;
	private Printer printer;
	
	public Screen(int N) {
		data = new Shape[N][N];
		size = N;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public int getSize() {
		return size;
	}
	
	public Shape[][] getData() {
		return data;
	}
	
	public boolean draw(Shape s) {
		int x = (int)(Math.random() * size);
		int y = (int)(Math.random() * size);
		
		if (data[x][y] == null) {
			data[x][y] = s;
			if (printer != null) printer.draw();
			pause(1000);
			return true;
		}
		else {
			pause(500);
			return false;
		}
	}
	
	public Shape get(int x, int y) {
		Shape s = data[x][y];
		pause(2000);
		data[x][y] = null;
		if (printer != null) printer.draw();
		return s;
	}
	
	public void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}
	
	
	void print() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
