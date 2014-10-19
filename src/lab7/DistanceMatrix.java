package lab7;

public class DistanceMatrix {

	static double findMin2(double[][] distances) {
		double min = Double.MAX_VALUE;
		
		for (int i = 0; i < distances.length; i++) {
			int numCol = distances[i].length;
			for (int j = 0; j < numCol; j++) { 
				if (distances[i][j] < min && distances[i][j] != 0) {
					min = distances[i][j];
				}
			}
		}
		
		return min;
	}
	
	static double findMin1(double[][] distances) {
		double min = 0;

		for (int i = 0; i < distances.length; i++) {
			int numCol = distances[i].length;
			for (int j = 0; j < numCol; j++) { 
				if (distances[i][j] != 0) {
					min = distances[i][j];
					break;
				}
			}
			if (min > 0) {
				break;
			}
		}
		
		for (int i = 0; i < distances.length; i++) {
			int numCol = distances[i].length;
			for (int j = 0; j < numCol; j++) { 
				if (distances[i][j] < min && distances[i][j] != 0) {
					min = distances[i][j];
				}
			}
		}
		
		return min;
	}

	
	static double[][] shuffle(double[][] distances) {
		// assume that "distances" is rectangular
		int numRow = distances.length;
		int numCol = distances[0].length;
		double[][] newMatrix = new double[numRow][numCol];
		
		// copy contents of distances to newMatrix
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {
				newMatrix[i][j] = distances[i][j];
			}
		}

		// shuffle one row at a time
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {
				int randomCol = (int)(Math.random() * numCol);
				double temp = newMatrix[i][randomCol];
				newMatrix[i][randomCol] = newMatrix[i][j];
				newMatrix[i][j] = temp;
			}
		}
		
		// shuffle one column at a time
		for (int j = 0; j < numCol; j++) {
			for (int i = 0; j < numRow; i++) {
				int randomRow = (int)(Math.random() * numRow);
				double temp = newMatrix[randomRow][j];
				newMatrix[randomRow][j] = newMatrix[i][j];
				newMatrix[i][j] = temp;
			}
		}

		// simpler solution
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {
				int randomCol = (int)(Math.random() * numCol);
				int randomRow = (int)(Math.random() * numRow);
				double temp = newMatrix[randomRow][randomCol];
				newMatrix[randomRow][randomCol] = newMatrix[i][j];
				newMatrix[i][j] = temp;
			}
		}
		
		return newMatrix;
	}
	
	public static void main(String[] args) {
		double[][] distances = {
				  {0, 983, 787, 714, 1375, 967, 1087}, 
				  {983, 0, 214, 1102, 1763, 1723, 1842}, 
				  {787, 214, 0, 888, 1549, 1548, 1627}, 
				  {714, 1102, 888, 0, 661, 781, 810}, 
				  {1375, 1763, 1549, 661, 0, 1426, 1187}, 
				  {967, 1723, 1548, 781, 1426, 0, 239}, 
				  {1087, 1842, 1627, 810, 1187, 239, 0},
		};
		
		System.out.println("min = " + findMin1(distances));
		System.out.println("min = " + findMin2(distances));
	}
}
