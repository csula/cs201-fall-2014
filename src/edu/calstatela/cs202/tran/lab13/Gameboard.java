package edu.calstatela.cs202.tran.lab13;

import java.awt.Graphics;

public class Gameboard implements ConstantTable {
	private int width;
	private int height;
	
	public void increase() {
		width = width + DELTA;
		height = height + DELTA;
	}
	
	public void decrease() {
		width = width - DELTA;
		height = height - DELTA;
	}
	
	Gameboard(int w, int h) {
		width = w;
		height = h;
	}

	void draw(Graphics g) {
		g.drawRect(30, 30, width-30, height-30);
		g.drawLine(120, 0, 120, 300);
		g.drawLine(210, 0, 210, 300);
		g.drawLine(0, 120, 300, 120);
		g.drawLine(0, 210, 300, 210);
		g.drawString("0", 75, 20);
		g.drawString("0", 10, 75);
		g.drawString("1", 165, 20);
		g.drawString("1", 10, 165);
		g.drawString("2", 255, 20);
		g.drawString("2", 10, 255);
		
		/* Winning Lines
		 	g.setColor(Color.red);
			g.drawLine(75, 30, 75, 300);
			g.drawLine(165, 30, 165, 300);
			g.drawLine(255, 30, 255, 300);
			g.drawLine(30, 75, 300, 75);
			g.drawLine(30, 165, 300, 165);
			g.drawLine(30, 255, 300, 255);
			g.drawLine(30, 30, 300, 300);
			g.drawLine(300, 30, 30, 300);

		*/

	}
}
