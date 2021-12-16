package com.projet.java;

import com.esisa.java.revision.shapes.Shape;

public class Player extends Thread {
	public static final int MAX_SCORE = 100;
	
	private Screen screen;
	private Semaphore semaphore;
	private ScorePrinter printer;
	
	private int score = 0;
	
	public Player(String name, Screen screen, Semaphore semaphore) {
		super(name);
		this.screen = screen;
		this.semaphore = semaphore;
	}
	
	public void setPrinter(ScorePrinter printer) {
		this.printer = printer;
	}

	public void run() {
		do {
			int x = (int)(Math.random() * screen.getSize());
			int y = (int)(Math.random() * screen.getSize());
			
			semaphore.waitDijkstra();
			Shape s = screen.get(x, y);
			semaphore.signalDijkstra();
			
			if (s == null) {
				score = score - 2;
				pause(10000);
			}
			else {
				score = score + s.getValue();
			}
			
			if (printer != null) printer.print();
			
		}
		while (score < MAX_SCORE);
	}

	public void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}

	public String toString() {
		return getName();
	}
	
	public int getScore() {
		return score;
	}
}
