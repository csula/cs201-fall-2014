package lab6;

public class PrintDaysOfTheWeek {

    public static void main(String[] args) {
        String[] daysOfTheWeek = { "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday" };

        String order = args[0];
        String username = args[1];

        System.out.println(username + " is here...");
        if (order.equals("backward")) {
            for (int i = daysOfTheWeek.length - 1; i >= 0; i--) {
                System.out.println(daysOfTheWeek[i]);
            }
        } else {
            for (String day : daysOfTheWeek) {
                System.out.println(day);
            }
        }
    }
}
