package quiz1retake;

public class CountProgram {

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

        // first print out everything to confirm contents
        for (int i = 0; i < k.length; i++) {
            System.out.println(i + " " + k[i]);
        }

        // next: first approach
        System.out.println("------");
        for (int i = 1; i < k.length; i += 2) {
            System.out.println(i + " " + k[i]);
        }

        // next: second approach
        System.out.println("------");
        for (int i = 0; i < k.length; i++) {
            if (i % 2 == 0)
                continue; // if i is even skip to the end of the loop
            System.out.println(i + " " + k[i]);
        }

        // practice at home:
        //   print out only even numbers
        //   print out if a number is divisible by 3
        //   print the array k in reverse order
        //   print the array k in alphabetical order == sorting

    }

}
