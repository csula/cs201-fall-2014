package lab11cs201;

import java.util.Scanner;

public class ShortestWord {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String line = scanner.nextLine(); // scanner.next()
        String[] words = line.split("\\s+");

        int minSize = Integer.MAX_VALUE;
        String minWord = "";

        for (String word : words) {
            if (word.length() < minSize) {
                minSize = word.length();
                minWord = word;
            }
        }

        System.out.println("word = " + minWord + " size = " + minSize);
    }

}
