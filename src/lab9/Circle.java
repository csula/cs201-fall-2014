package lab9;

public class Circle {
    double radius = 1.0;

    Circle() {
        // default constructor
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        String message = "circle: radius = " + radius + 
                " area = " + getArea();
        return message;
    }

    public static void main(String[] args) {
        Circle[] circleArray = new Circle[12];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle( i * 1.0 );
        }

        // goal print out the circles
        // System.out.println( circleArray[3] );

        for ( Circle circle : circleArray ) {
            System.out.println( circle );
        }

        // generate 20 circles with a random radius between 1 & 100
        // find the 2 circles with the minimum and maximum area
    }

}







