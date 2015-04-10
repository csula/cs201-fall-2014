package edu.calstatela.cs202.tran.lab13;

public class GamePlay implements GameConstant {
	int[][] state;

	GamePlay() {
		state = new int[3][3];
	}
	
	int[] nextPlay() {
		int next[] = null;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (state[i][j] == 0) {
					next = new int[2];
					next[0] = i;
					next[1] = j;
					return next;
				}
			}
		}

		return next;
	}
	
	void setPiece(int x, int y, int val) {
		state[y][x] = val;
	}
	
	boolean isValid(int x, int y) {
		if (state[y][x] == 0)
			return true;
		else
			return false;
	}
	
	int[][] getState() {
		return state;
	}
	
	boolean isWinRow(int r) {
		return (state[r][0] == state[r][1] && state[r][1] == state[r][2]);
	}
	
	boolean isWinCol(int c) {
		return (state[0][c] == state[1][c] && state[1][c] == state[2][c]);
	}
	
	int[] getWinningLine() {
		int w[] = new int[4];

		for (int r = 0; r < 3; r++) {
			if (isWinRow(r)) {
				w[0] = r; w[2] = r;
				w[1] = 0; w[3] = 2;
			}
		}
		
		for (int c = 0; c < 3; c++) {
			if (isWinRow(c)) {
				w[0] = 0; w[2] = c;
				w[1] = 2; w[3] = c;
			}
		}

		if (state[0][0] == state[1][1] && state[1][1] == state[2][2]) {
			w[0] = 0; w[2] = 2;
			w[1] = 0; w[3] = 2;
		}
		
		if (state[2][0] == state[1][1] && state[1][1] == state[0][2]) {
			w[0] = 2; w[2] = 0;
			w[1] = 0; w[3] = 2;
		}

		return w;
	}
}
