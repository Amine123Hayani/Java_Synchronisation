package com.projet.java;

import javax.swing.JFrame;

import com.esisa.java.revision.graphics.DrawPanel;
import com.esisa.java.revision.graphics.ScoreFrame;

public class ScreenFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private Screen screen;

	public ScreenFrame() {
		init();
	}
	
	void draw() {
		DrawPanel printer = new DrawPanel(screen);
		screen.setPrinter(printer);
		
		setContentPane(printer);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	void init() {
		screen = new Screen(8);
		draw();
		Semaphore semaphore = new Semaphore("M", 1);
		
		Drawer d1 = new Drawer("D1", screen, semaphore);
		d1.start();
		
		System.out.println("waiting ...");
		try {
			Thread.sleep(10000);
		}
		catch (Exception e) {
		}
		
		Player p1 = new Player("P01", screen, semaphore);
		p1.start();

		ScoreFrame printer = new ScoreFrame(p1);
		p1.setPrinter(printer);
		
		Player p2 = new Player("P02", screen, semaphore);
		p2.start();

		ScoreFrame printer2 = new ScoreFrame(p2);
		p2.setPrinter(printer2);
	}

	public static void main(String[] args) {
		new ScreenFrame();
	}
}
