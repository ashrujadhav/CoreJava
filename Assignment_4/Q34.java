/*34.	Create a class Circle that has two data members, 
one to store the radius and another to store area and 
three methods first init() method to input radius from user,
 second calculateArea() method to calculate area of circle and
 third display() method to display values of radius and area.
 Create class CircleDemo ( main class) that creates the Circle 
object and calls init(), calculateArea() and display() methods.*/
import java.util.*;
class Circle{
	
	private double radius;
	private double area;
	
	void init(double radius) {		
		this.radius = radius;		
	}

	
	double calculateArea(double radius) {		
		return (3.14 * radius * radius);
	}

	
	void display() {		
		double res = calculateArea(this.radius);
		System.out.println("Area of circle for given radius is : "+res);
	}
} 

public class Circle_Demo{
	
	public static void main(String[] args) {
		
		Circle obj1 = new Circle();
		
		obj1.init(5.15);
		obj1.display();
	}
}