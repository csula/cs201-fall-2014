package lab5;

public class RandomNumbers {

    public static void main(String[] args) {
        int size = 1000000;
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println((int)(Math.random() * 10 + 1) );
        }
    }
}
