package lab6;

public class ForEachDay {

    public static void main(String[] args) {
        String[] daysOfTheWeek = { "Monday", "Tuesday", "Wednesday", 
                "Thursday", "Friday", "Saturday", "Sunday" };

        // i am only interested in days that begins T or S
        for ( String day : daysOfTheWeek ) {
            if ( day.charAt(0) == 'T' || day.charAt(0) == 'S' )
                System.out.println(day);
        }
    }

}
