package lab11cs201;

public class UniqueWords {

    public static void main(String[] args) {
        String line = "the quick brown fox jumps over the lazy dog";
        String[] words = line.split("\\s+");

        java.util.Arrays.sort( words );

        String current = "";
        String previous = "";
        int count = 0;

        for (String word : words) {
            if (! word.equals(current) ) {
                if (count > 0) {
                    System.out.println(previous + " " + count);
                }
                current = word;
                count = 1;
            } else {
                count++;
            }
            previous = word;
        }
        if (count > 0) {
            System.out.println(previous + " " + count);
        }
    }

}
