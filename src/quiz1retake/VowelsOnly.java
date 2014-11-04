package quiz1retake;

public class VowelsOnly {

    public static boolean isStartVowel(String word) {
        boolean status = false;
        char[] vowels = {'a', 'e','i', 'o', 'u' }; 
        char firstChar = word.charAt(0);
        for (char vowel : vowels) { // for each "vowel" of "vowels"
            if (firstChar == vowel) {
                status = true;
                break;
            }
        }

        return status;
    }

    public static void main(String[] args) {
        String[] k = {
                "zero",
                "one",
                "two", 
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
        };

        for (String word : k) {  // for each "word" of "k"
            if ( isStartVowel( word ) ) {
                System.out.println(word);
            }
        }


        // practice at home:
        //   1. print out word only if it ends with a vowel
        //   2. print out the shortest word in k
        //   3. print out the longest word in k
        //   4. print out all of the longest word(s) in k
    }

}
