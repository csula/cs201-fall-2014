package lab11;

import java.util.ArrayList;

class Ingredient {
    String name;
    double quantity;
    String unit;
    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
    public String toString() {
        return String.format("%-30s %g", 
                String.format("%s (%s)", name, unit), quantity);
    }
}

public class StackNoMore {

    public static void main(String[] args) {

        ArrayList<Ingredient> arrayList = 
                new ArrayList<Ingredient>();

        arrayList.add( new Ingredient("celery", 1, "stem") );
        arrayList.add( new Ingredient("tomato", 3, "kg") );
        arrayList.add( new Ingredient("pinto beans", 1, "can") );

        java.util.Collections.shuffle(arrayList);

        for (Ingredient ingredient : arrayList ) {
            System.out.println(ingredient);
        }


    }
}
