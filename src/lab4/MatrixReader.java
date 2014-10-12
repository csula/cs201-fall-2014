package lab4;

import java.util.Scanner;

public class MatrixReader {
    public static void main(String args[]) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        col = scanner.nextInt();
        row = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                double val = scanner.nextDouble();
                System.out.print(val + " ");
            }
            System.out.println("");
        }

    }
}
