package lab5;

public class SmartAdd {

    public static void add(String str1, String str2) {
        double n1 = Double.parseDouble(str1);
        double n2 = Double.parseDouble(str2);
        add(n1, n2);
    }

    public static void add(double n1, double n2) {
        System.out.println( n1 + " + " + n2 + " = " + (n1+n2) );
    }

    public static void main(String[] args) {
        add("1.0", "2.0");
        add(1.0, 2.0);
    }

}
