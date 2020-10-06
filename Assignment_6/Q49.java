/* 49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax(). a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. c. Create class for main method(Say XYZ), accept employee information and a product information from user
 and print income tax and sales tax respectively.*/
import java.util.*;

interface Taxable{
	
	int salesTax = 7;
	double incomeTax = 10.5;
}

abstract class Abstract{
	
	double tax;	
	abstract void CalcTax();
	
	void showData() {  System.out.println("The yearly tax on given inputs : "+tax); }
			
}

class Employee extends Abstract implements Taxable{
	
	private int empId;
	private String name;
	private double salary;
	
	Employee(int empId, String name, double salary) 
        {		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void CalcTax() 
        {  tax = (incomeTax * salary) / 100;	}	
		
	
}

class Product extends Abstract implements Taxable{
	
	private int pid;
	private double price;
	private int quantity;
	
	Product(int pid, double price, int quantity) 
        {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	void CalcTax() 
        {
		double res = price * quantity;
		tax = (salesTax * res) / 100;
	} 
}

public class Q49{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice to perform operation.");
			
		System.out.println("1. To calculate the employee's salary tax.");
		System.out.println("2. To calculate the product tax.");
		System.out.println("0. Exit.");
		int choice;
			
		while((choice = sc.nextInt())!=0) {
				
			if(0<choice && choice<=2) {				
			
				switch(choice) {
					
					case 1 : 
						System.out.println("Enter the employee details.");
						System.out.print("Enter the empId : ");
						int empId = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter the emp name : ");
						String name = sc.nextLine();
						System.out.print("Enter the emp salary : ");
						double salary = sc.nextInt();
						
						Employee obj1 = new Employee(empId, name, salary);
						obj1.CalcTax();
						obj1.showData();
						
						break;
						
					case 2 :
						sc.nextLine();
						System.out.println("Enter the product details.");
						System.out.print("Enter the pid : ");
						int pid = sc.nextInt();
						System.out.print("Enter the price : ");
						double price = sc.nextDouble();
						System.out.print("Enter the quantity : ");
						int quantity = sc.nextInt();
						
						Product obj2 = new Product(pid, price, quantity);
						obj2.CalcTax();
						obj2.showData();
						
						break;
				}
			      } 
                              else {System.out.println("Please provide the valid inputs.");}
			
				
			
} 
}
}
