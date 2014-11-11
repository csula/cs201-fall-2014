package lab11cs201;

public class UniqueWordsCount {

    public static void main(String[] args) {
        String line = "the quick brown fox jumps over the lazy dog";
        String[] words = line.split("\\s+");

        java.util.Arrays.sort( words );

        String current = "";

        for (String word : words) {
            if (!word.equals( current ) ) {
                System.out.println(word);
                current = word;
            }
        }
    }

}
