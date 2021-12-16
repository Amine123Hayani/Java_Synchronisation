package com.java.projet.graphics;

import java.util.LinkedList;

public class Semaphore {
	private String name;
	private int value;
	private LinkedList<Thread> waitingList;
	
	public Semaphore(String name) {
		this.name = name;
		init(1); // Sémaphore d'exclusion mutuelle
	}
	
	public Semaphore(String name, int value) {
		this.name = name;
		init(value);
	}

	synchronized public void init(int value) {
		this.value = value;
		waitingList = new LinkedList<>();
	}
	
	synchronized public void waitDijkstra() {
		value--;
		if (value < 0) { // Ressource non libre || Section critique occupée
			bloquer();
		}
	}
	
	synchronized public void signalDijkstra() {
		value++;
		if (value <= 0) {
			reveiller();
		}
	}
	
	private void bloquer() {
		waitingList.add(Thread.currentThread());
		System.out.println(">> " + Thread.currentThread() + " se bloque => " + name + " : " + waitingList);
		try {
			wait();
		}
		catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		waitingList.remove(Thread.currentThread());
		System.out.println(">> " + Thread.currentThread() + " se réveille => " + name + " : " + waitingList);		
	}
	
	private void reveiller() {
		System.out.println(">> " + Thread.currentThread() 
										+ " demande de réveiller un processus");
		notify();
	}
}
