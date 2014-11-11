package lab11cs201;

public class SortWords {

    public static void main(String[] args) {
        String line = "the quick brown fox jumps over the lazy dog";
        String[] words = line.split("\\s+");

        java.util.Arrays.sort( words );

        for (String word : words) {
            System.out.println(word);
        }
    }

}
