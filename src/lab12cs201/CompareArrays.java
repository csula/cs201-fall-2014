package lab12cs201;

public class CompareArrays {

    public static boolean hasCommon(int[] a, int[] b) {
        int N = a.length;
        int M = b.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (a[i] == b[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int N = 10;
        int min = 0;
        int max = 115;

        int[] a = RandomArray.generate(N, min, max);
        int[] b = RandomArray.generate(N, min, max);
        RandomArray.print(a);
        System.out.println("---");
        RandomArray.print(b);

        System.out.println("a and b has something in common: " + 
                hasCommon(a,b));
    }

}
