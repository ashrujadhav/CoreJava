/*32.	Modify the above program (no. 30) to count the no of Student objects created. 
[ In this program static variable is required ]*/
import java.util.*;

class Student{
	
	private int rno;
	private String name;
	private static int counter;
	
	void setData(int a, String b, int c) {
		
		rno = a;
		name = b;
		counter = c;
	}
	
	void showData() {
		
		System.out.println(rno+" "+name);
	}
	
	void countMethod() {
		
		System.out.println("Count of object created for Student class is : "+counter);
	}
}

public class Q32{
	
	public static void main(String args[]) {
		
		Student std1 = new Student();
		
		std1.setData(01, "Ashruba Jadhav", 1);
		std1.showData();
		
		Student std2 = new Student();
		
		std2.setData(02, "Suraj Jadhav", 2);
		std2.showData();
		
		std2.countMethod();
	}
}
