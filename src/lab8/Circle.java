package lab8;

public class Circle {
	double radius = 1.0;
	
	Circle() {
		// do nothing constructor
	}
	
	Circle(double newRadius) {
		radius = newRadius;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		Circle a = new Circle();
		Circle b = new Circle( 2.0 );
		
		System.out.println("area(a) = " + a.getArea());
		System.out.println("area(b) = " + b.getArea());
	}
	
}
