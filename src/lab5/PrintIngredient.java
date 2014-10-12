package lab5;

public class PrintIngredient {

    public static String format(String ingredient,
            String unit, double q) {
        String lakshmi = ingredient + " (" + unit + ")"; 
        String fs = String.format("%-30s %3.2f\t\t%3.2f\t\t%3.2f", 
                lakshmi, 1.0 * q, 2.0 * q, 5.0 * q);
        return fs;
    }

    public static void printIngredient(String ingredient,
            String unit, double q) {
        String lakshmi = ingredient + " (" + unit + ")"; 
        String fs = String.format("%-30s %3.2f\t\t%3.2f\t\t%3.2f", 
                lakshmi, 1.0 * q, 2.0 * q, 5.0 * q);
        System.out.println(fs);
    }

    public static void main(String[] args) {
        System.out.println("Ingredient                     1 (person)       2 (persons)     5 (persons)");
        System.out.println( format("beans", "cans", 1) );
        printIngredient("parsley", "bunch", 0.5);
    }

}
