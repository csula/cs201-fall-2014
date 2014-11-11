package lab11cs201;

import java.util.Scanner;

public class ShortestWords {

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

        for (String word : words) {
            if (word.length() == minSize) {
                System.out.println(word);
            }
        }

    }

}
