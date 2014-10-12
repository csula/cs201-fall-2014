package lab5;

public class ComputeAverage {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int size = scanner.nextInt();

        // 1. create the array
        double[] array = new double[size];

        // 2. read in the array
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextDouble();

        // 3. add up all the numbers
        double sum = 0.0;
        for (int i = 0; i < size; i++)
            sum += array[i];

        // 4. print out the result
        System.out.println("average = " + sum/size);
    }

}
