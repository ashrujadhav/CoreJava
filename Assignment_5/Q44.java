/* 44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
*/
import java.util.*;

class Faculty{
	
	private int facultyId;
	private double salary;
	
	void input(int facultyId, double salary) {
		
		this.facultyId = facultyId;
		this.salary = salary;
	}
	
	void printSalary() {
		
		System.out.println("Faculty's salary : "+salary);
	}
}

class FullTimeFaculty extends Faculty{
	
	private double basicSalary;
	private double allowance;
	
	void input(int facultyId, double basicSalary, double allowance) {
		
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		
		double salary = basicSalary + allowance;
		super.input(facultyId, salary);
		
	}
	
}

class PartTimeFaculty extends Faculty{
	
	private int workingHours;
	private double ratePerHour;
	
	void input(int facultyId, int workingHours, double ratePerHour) {
		
		this.workingHours = workingHours;
		this.ratePerHour = ratePerHour;
		
		double salary = workingHours * ratePerHour;
		super.input(facultyId, salary);
	}
}

public class FacultyDemo{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		FullTimeFaculty obj1 = new FullTimeFaculty();
		obj1.input(01, 40000.345, 5000);
		obj1.printSalary();
		
		FullTimeFaculty obj2 = new FullTimeFaculty();
		obj2.input(02, 20000.267, 6000);
		obj2.printSalary();
		
		PartTimeFaculty obj3 = new PartTimeFaculty();
		obj3.input(03, 5, 200);
		obj3.printSalary();
		
		PartTimeFaculty obj4 = new PartTimeFaculty();
		obj4.input(04, 4, 400);
		obj4.printSalary();
	}
}