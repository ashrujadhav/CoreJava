/*45.	Create a class Student with two members : 
rollno and percentage. Create default and 
parameterized constructors. Create method show()
 to display information. Create another class 
CollegeStudent inherits Student class. Add a new 
member semester to it. Create default and parameterized 
constructors. Also override show() method that calls
 super class show() method and displays semester. 
Create another class SchoolStudent inherits Student class.
 Add a new member className(eg 12th ,10th etc.) to it. 
Create default and parameterized constructors. 
Also override show() method that calls super class show() 
method and displays className. Create a class( say Demo) 
with main method that carries out the operation of the project : -
- has array to store objects of any class(Student, 
 CollegeStudent or SchoolStudent) --create two CollegeStudent
  and three SchoolStudent objects and store them inside the 
array -- display all records from the array -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.  */
import java.util.*;

class Student{
	
	private int rollNo;
	public double percentage;

	Student() {
		
		this(2, 99);
	} 
	
	Student(int rollNo, double percentage) {
		
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
	
	void show() {
		
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Percentage : "+percentage);
	}
		
}

class CollegeStudent extends Student{
	
	private int semester;
	
	CollegeStudent() {
		
		this(2, 80, 6);
	}
	
	CollegeStudent(int rollNo, double percentage, int semester) {
		
		super(rollNo, percentage);
		this.semester = semester;
	}
	
	void show() {
		
		super.show();
		System.out.println("Semester : "+semester);
		
	}
}

class SchoolStudent extends Student{
	
	private String className;
	
	SchoolStudent() {
		
		this(12, 81, "10th");
	}
	
	SchoolStudent(int rollNo, double percentage, String className) {
		
		super(rollNo, percentage); 
		this.className = className;
	}
	
	void show() {
		
		super.show();
		System.out.println("Class Name : "+className);
	}
}

public class Q45{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of five students.");

                
                System.out.println("Provide the details of first college student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo4 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage4 = sc.nextDouble();
		System.out.print("Enter the number of semester : ");
		int semester4 = sc.nextInt();
		
		System.out.println("Provide the details of second college student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo5 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage5 = sc.nextDouble();
		System.out.print("Enter the number of semester : ");
		int semester5 = sc.nextInt();





		
		System.out.println("Provide the details of first school student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo1 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the class name : ");
		String className1 = sc.nextLine();
		
		System.out.println("Provide the details of second school student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo2 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the class name : ");
		String className2 = sc.nextLine();
		
		System.out.println("Provide the details of third school student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo3 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the class name : ");
		String className3 = sc.nextLine();
		
		
		
		Student arr[] = {
			new CollegeStudent(rollNo4, percentage4, semester4), 
			new SchoolStudent(rollNo1, percentage1, className1), 
			new SchoolStudent(rollNo2, percentage2, className2), 
			new CollegeStudent(rollNo5, percentage5, semester5), 
			new SchoolStudent(rollNo3, percentage3, className3)
		};
		
		for(Student trav : arr) {
			
			trav.show();
		}
		
		int counter = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].percentage>75)
				counter++;
		}
		
		System.out.println("The count of students who all are having A grade : "+counter);
	}
}
