package edu.calstatela.cs202.tran.lab13;

import java.awt.Color;
import java.awt.Graphics;

public class Chip implements ConstantTable {
	private int x;
	private int y;
	private Color c;

	Chip(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}

	void draw(Graphics g) {
		g.setColor(c);
		g.fillOval(x * 100 + 50 - RADIUS, y * 100 + 50 - RADIUS, RADIUS * 2, RADIUS * 2);
	}
}
