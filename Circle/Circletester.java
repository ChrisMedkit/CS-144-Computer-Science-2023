
public class Circletester {

	public static void main(String[] args) {
		System.out.println("in main");
		Circle c1 = new Circle(5.2);
		System.out.println("c1 is " + c1);
		System.out.println("radius is " + c1.getRadius());
		c1.setRadius(3.14);
		System.out.println("radius is now " + c1.getRadius());
		System.out.println("circumference is " + c1.circumference());
		System.out.println("area is " + c1.area());
		
		//for fun
		Circle c2 = c1;
		System.out.println("c2 is " + c2);
		c2.setRadius(22);
		System.out.println("radius of c1 now " + c1.getRadius()); 
		
		Circle c3 = new Circle();
		System.out.println("c3 radius " + c3.getRadius());
		System.out.println("c3 circumference " + c3.circumference());
		System.out.println("c3 area " + c3.area());
		System.out.println();
		
		//test printCircle method
		c1.printCircle();
		c2.printCircle();
		c3.printCircle();
		System.out.println();
		
		//Array that holds 50 Circle objects
		Circle[] circles = new Circle[50];
		for (int i = 0; i<circles.length; i++) {
			circles[i] = new Circle(i);
			circles[i].printCircle();
		}
	}
}
