package lab4;

import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {
        Scanner robert = new Scanner(System.in);
        double n1 = robert.nextDouble();
        double n2 = robert.nextDouble();

        System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, n1*n2);
    }

}
