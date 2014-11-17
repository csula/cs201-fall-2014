package lab12cs201;

public class RandomArray {

    public static void print(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            System.out.println( a[i] );
        }
    }

    public static int random(int lower, int upper) {
        return (int)(Math.random() * (upper-lower)) + lower;
    }

    public static int[] generate(int N, int min, int max) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = (int)(Math.random() * max + min);
        }

        return a;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt( args[0] );
        int min = Integer.parseInt( args[1] );
        int max = Integer.parseInt( args[2] );

        System.out.println("N = " + N);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        // part 2

        int[] a = generate(N, min, max);

        print(a);

        // part 2 
        // generate an array of size N with numbers min to max
        // shuffle the array, the print out the array

        for (int i = 0; i < N; i++) {
            a[i] = min + i;
        }

        for (int i = 0; i < N; i++) {		
            int j = random(0, N);
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        print(a);
    }

}
