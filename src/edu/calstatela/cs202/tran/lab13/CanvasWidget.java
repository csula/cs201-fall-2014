package edu.calstatela.cs202.tran.lab13;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class CanvasWidget extends JPanel implements ConstantTable {
	private static final long serialVersionUID = 6126153369876628048L;
	private Gameboard gameBoard;
	
	private ArrayList<Chip> chipArray = new ArrayList<Chip>();
	
	public void addChip(Chip newChip) {
		chipArray.add(newChip);
	}
	
	public CanvasWidget(int width, int height) {
		super();
		// testChip = new Chip(1,1, Color.RED);
		gameBoard = new Gameboard(BOARD_WIDTH, BOARD_HEIGHT);
		this.setPreferredSize(new Dimension(width, height));
	}

	public void setMessage(String message) {
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		gameBoard.draw(g);
		// testChip.draw(g);
		for (Chip chip : chipArray) {
			chip.draw(g);
		}
	}

}
