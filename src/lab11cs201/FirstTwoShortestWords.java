package lab11cs201;

import java.util.Scanner;

public class FirstTwoShortestWords {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String line = scanner.nextLine(); // scanner.next()
        String[] words = line.split("\\s+");

        int minSize = Integer.MAX_VALUE;

        for (String word : words) {
            if (word.length() < minSize) {
                minSize = word.length();
            }
        }

        int counter = 0;

        for (String word : words) {
            if (word.length() == minSize && counter < 2) {
                System.out.println(word);
                counter++;
            }
        }

    }

}
