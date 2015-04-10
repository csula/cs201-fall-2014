package edu.calstatela.cs202.tran.lab13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderController extends JPanel implements ConstantTable {

	private static final long serialVersionUID = 1L;
	private int row;
	private int column;

	private GamePlay gamePlayRef;
	private CanvasWidget canvasRef;

	public SliderController(GamePlay ref, CanvasWidget canvas) {

		gamePlayRef = ref;
		canvasRef = canvas;

		// right panel
		this.setLayout(new BorderLayout());

		final JSlider rowSlider = new JSlider(JSlider.VERTICAL);
		final JSlider columnSlider = new JSlider(JSlider.HORIZONTAL);
		JButton goButton = new JButton("GO!");

		rowSlider.setMaximum(2);
		columnSlider.setMaximum(2);
		rowSlider.setInverted(true);
		rowSlider.setValue(0);
		columnSlider.setValue(0);

		this.add(rowSlider, BorderLayout.WEST);
		this.add(columnSlider, BorderLayout.NORTH);
		this.add(goButton, BorderLayout.CENTER);

		rowSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				row = rowSlider.getValue();
			}
		});

		columnSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				column = columnSlider.getValue();
			}
		});

		goButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("row is: " + row);
				System.out.println("column is: " + column);
				if (gamePlayRef.isValid(column, row)) {
					gamePlayRef.setPiece(column, row, HUMAN);
					Chip chip = new Chip(column, row, Color.RED);
					canvasRef.addChip(chip);
					canvasRef.repaint();

					int array[] = gamePlayRef.getWinningLine();
					if (array != null) {
						System.out.println("WINNER WINNER CHICKEN DINNER");
					}

					int next[] = gamePlayRef.nextPlay();
					int r = next[0];
					int c = next[1];
					Chip computeChip = new Chip(c, r, Color.BLUE);
					canvasRef.addChip(computeChip);
					gamePlayRef.setPiece(c, r, COMPUTER);
					canvasRef.repaint();
				}
			}
		});
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
}
