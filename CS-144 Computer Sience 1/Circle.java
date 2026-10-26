
public class Circle {
	//instance variavle (data member)
	private double radius;
	
    //constructors
    public Circle( double r) {
        radius = r; 
    }
    public Circle() { //default constructor
    	radius = 1.0;
    }
    //getter and setters
    public double getRadius () {
    	return radius;
    }
    
    public void setRadius (double newRadius) {
    	radius = newRadius;
    }
    //instance variables
    public double circumference() {
    	double result = 2.0 * Math.PI * radius;
    	return result;
    }
    public double area() {
    	double result = Math.PI * Math.pow(radius, 2);
    	return result;
    }
    public void printCircle() {
    	System.out.print(" Radius: " + radius);
    	System.out.print(" Circumference: " + circumference());
    	System.out.println(" Area: " + this.area());
    	}
    }
    

