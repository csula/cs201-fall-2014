package quiz1;

public class TalesOfTwoCities {

    public static void main(String[] args) {

        double[][] distances = {
                {0, 983, 787, 714, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1627},
                {714, 1102, 888, 0, 661, 781, 810},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 0, 239},
                {1087, 1842, 1627, 810, 1187, 239, 0},
        };

        String[] cities = { "Chicago", "Boston", "New York", "Atlanta",
                "Miami", "Dallas", "Houston" };

        System.out.println("Nearest two cities: " +
                findNearestCities(cities, distances));

        System.out.println("Nearest city to New York: " +
                findNearestCity(cities, distances, "New York"));

        System.out.println("distance between Atlanta and Chicago is: " +
                findDistance(cities, distances, "Atlanta", "Chicago"));
    }

    public static String findNearestCities(String[] cities,
            double[][] distances) {
        String nearestCities = "do not know";
        
        /* fill in the missing code */
        
        return nearestCities;
    }

    public static String findNearestCity(String[] cities,
            double[][] distances, String city) {
        String nearestCity = "do not know";
        
        /* fill in the missing code */
        
        return nearestCity;
    }

    public static double findDistance(String[] cities,
            double[][] distances, String city1, String city2) {
        double distance = 0.0;
        
        /* fill in the missing code */
        
        return distance;
    }
}
