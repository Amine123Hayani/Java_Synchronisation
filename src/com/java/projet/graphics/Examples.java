package com.java.projet.graphics;

import com.esisa.java.revision.shapes.Shape;

public class Examples {

	public Examples() {
		exp01();
	}
	
	void exp01() {
		Screen s1 = new Screen(8);
		Shape data[][] = s1.getData();
		print(data);
	}
	
	void print(Shape data[][]) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Examples();
	}

}
