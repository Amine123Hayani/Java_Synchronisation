package com.projet.java.graphics;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.projet.java.Player;
import com.projet.java.ScorePrinter;

public class ScoreFrame extends JFrame implements ScorePrinter {
	private static final long serialVersionUID = 1L;
	
	private Player player;
	private JLabel scoreLabel;

	public ScoreFrame(Player player) {
		this.player = player;
		
		JPanel p1 = new JPanel();
		JLabel l1 = new JLabel("Score du joueur [" + player.getName() + "] : ");
		scoreLabel = new JLabel("000");
		
		Font font = new Font("Consolas", Font.BOLD, 32);
		l1.setFont(font);
		scoreLabel.setFont(font);
		scoreLabel.setForeground(Color.red);
		
		p1.add(l1);
		p1.add(scoreLabel);
		
		setContentPane(p1);
		pack();
		setVisible(true);
	}

	public void print() {
		scoreLabel.setText("" + player.getScore());
	}
}
