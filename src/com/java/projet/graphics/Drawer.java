package com.java.projet.graphics;

import com.projet.java.shapes.Circle;
import com.projet.java.shapes.Line;
import com.projet.java.shapes.Pixel;
import com.projet.java.shapes.Shape;
import com.projet.java.shapes.Square;
import com.projet.java.shapes.Triangle;

public class Drawer extends Thread {
	private Screen screen;
	private Semaphore semaphore;
	public static int MAXSCORE=20;
	private int score=0; 
	
	public Drawer(String name, Screen screen, Semaphore semaphore) {
		super(name);
		this.screen = screen;
		this.semaphore = semaphore;
	}
	
	public void run() {
		do {
			int choice = (int)(Math.random() * 5);
			Shape s = generateShape(choice);
			
			semaphore.waitDijkstra();
			screen.draw(s);
			score+=s.getValue();
			screen.print();
			semaphore.signalDijkstra();
		}
		while(score<MAXSCORE);
	}
	
	private Shape generateShape(int choice) {
		if (choice == 0) return new Circle();
		else if (choice == 1) return new Triangle();
		else if (choice == 2) return new Square();
		else if (choice == 3) return new Line();
		else if (choice == 4) return new Pixel();
		else return null;
	}

	public String toString() {
		return getName();
	}
}
