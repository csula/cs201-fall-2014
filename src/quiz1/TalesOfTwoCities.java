package quiz1;

public class TalesOfTwoCities {

    static String getCityName(String[] cities, int index) {
        return cities[index];
    }

    static int getCityIndex(String[] cities, String cityName) {
        int index = -1;

        for (int i = 0; i < cities.length; i++) {
            if (cityName.equals(cities[i])) {
                return i;
            }
        }

        return index;
    }

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
        // expect "city1name"-"city2name"

        System.out.println("Nearest city to New York: " +
                findNearestCity(cities, distances, "New York"));
        // expect name of city that is closest to New York

        System.out.println("distance between Atlanta and Chicago is: " +
                findDistance(cities, distances, "Atlanta", "Chicago"));
        // expect the distance between two cities (atlanta & chicago)
    }

    public static String findNearestCities(String[] cities,
            double[][] distances) {

        // FIND = visit or examine every value

        // for each value in distances
        //    is this value minimum
        //       if yes: save indices and update min
        //       if no: continue

        // return city1 with first index + city2 with second index

        String nearestCities = "do not know";
        double min = Double.MAX_VALUE;
        int city1Index = -1, city2Index = -1;

        for (int i = 0; i < distances.length; i++) {
            for (int j = 0; j < distances[i].length; j++) {
                if (min < distances[i][j] && distances[i][j] > 0) {
                    city1Index = i;
                    city2Index = j;
                    min = distances[i][j];
                }
            }
        }

        nearestCities =  getCityName(cities, city1Index) + "-"
                + getCityName(cities, city2Index);

        return nearestCities;
    }

    public static String findNearestCity(String[] cities,
            double[][] distances, String city) {

        // for each neighbor of city
        //    if distance < min:
        //        update min, save index
        // return city with index

        String nearestCity = "do not know";
        int cityPosition = getCityIndex(cities, city);
        int nearestIndex = -1;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < distances.length; i++) {
            if (min < distances[i][cityPosition] && 
                    distances[i][cityPosition] > 0) {
                min = distances[i][cityPosition];
                nearestIndex = i;
            }
        }

        nearestCity = getCityName(cities, nearestIndex);

        return nearestCity;
    }

    public static double findDistance(String[] cities,
            double[][] distances, String city1, String city2) {

        double distance = 0.0;

        int city1Index = getCityIndex(cities, city1);
        int city2Index = getCityIndex(cities, city2);

        distance = distances[city1Index][city2Index];
        return distance;
    }
}
