 /* 48.	Create an Abstract class Processor with int member variable data  and method showData to display data value. Create abstract method process() to define processing of member data. Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by overriding the process method. b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.Ask user to enter choice (factorial or circle area).  Also ask data to work upon. Use Processor 
class reference to achieve this mechanism.*/ 
import java.util.*;

abstract class Processor{
	
	int data;
	
	void showData() {
		
		System.out.println("Data : "+data);
	}
	
	abstract void process();
	
}

class Factorial extends Processor{
	
	void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial.");
		int input = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=input; i++) {
			
			fact = fact * i;
		}
		
		data = fact;
	}
}

class Circle extends Processor {
	
	final double PI = 3.14;
	
	void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate area of circle.");
		int input = sc.nextInt();
		
		data = PI * input * input;
	}
}


public class Q47{
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice to perform operation.");
			
		System.out.println("1. Factorial of given number.");
		System.out.println("2. Area of circle for given radius.");
		System.out.println("0. Exit.");
		int choice = sc.nextInt();
		
		if(0<=choice && choice<=2) {
			
			if(choice != 0) {
			
				switch(choice) {
					
					case 1: 
						Factorial obj1 = new Factorial();
						obj1.process();
						obj1.showData();
						break;
					
					case 2: 
						Circle obj2 = new Circle();
						obj2.process();
						obj2.showData();
						break;
						
				}
			}
		}
		else {
			
			System.out.println("Please provide the valid inputs.");
		}
	}
}
