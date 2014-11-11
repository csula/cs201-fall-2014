package lab10;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(100);
        Random random = new Random();

        stack.push( random.nextInt(10) );
        stack.push( random.nextInt(10) );
        stack.push( random.nextInt(10) );

        stack.print();
        stack.pop();
        stack.print();
    }

}
