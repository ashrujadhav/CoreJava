/*38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.
 */
import java.util.*;

class Employee{
	
	private static int empNo;
	private double salary;
	private static double totalSalary;
	
	Employee(double salary){
		
		this.totalSalary = this.totalSalary + salary;
		this.empNo++;
	}
	
	static void showRecord() {
		
		System.out.println("The details of all employees - no of emp : "+empNo+" total salary : "+totalSalary);
	}
}

public class Q38{
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee(435.658);
		Employee obj2 = new Employee(73429.88);
		Employee obj3 = new Employee(127.68);
		Employee obj4 = new Employee(1820.55);
		
		Employee.showRecord();
	}
}
