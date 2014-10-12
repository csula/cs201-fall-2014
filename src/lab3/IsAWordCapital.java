package lab3;

import java.util.Scanner;

public class IsAWordCapital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a word: ");
        String word = input.next();

        boolean state = Character.isUpperCase(word.charAt(0));
        String result = state ? " is " : " is not ";

        System.out.println(word + result + "capitalized");
    }

}
