package lab4;

import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 10;
        int secretNumber = (int)(Math.random() * upperBound + lowerBound);
        boolean done = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("psst the secret number is: " + secretNumber);
        while(!done) {
            System.out.println("give me a number: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("you've got it!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("higher please!");
            } else {
                System.out.println("lower please!");
            }
        }

        System.out.println("you owe me a coke!");
    }

}
