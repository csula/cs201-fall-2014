package lab2;

public class SimpleAverage {

    public static void main(String[] args) {
        int a1 = (int)(Math.random() * 10) + 1;
        int a2 = (int)(Math.random() * 10) + 1;
        int a3 = (int)(Math.random() * 10) + 1;
        int a4 = (int)(Math.random() * 10) + 1;

        double avg = ((a1 + a2 + a3 + a4)/(double)4);

        System.out.println("1st number is " + a1);
        System.out.println("2nd number is " + a2);
        System.out.println("3rd number is " + a3);
        System.out.println("4th number is " + a4);
        System.out.println("Average is " + avg);
    }
}
