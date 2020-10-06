/* 31.	Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls
 setData() and showData() methods.import java.util.*;*/

class Student{

	private int rno;
	private String name;

	void setData(int a, String b)
        {
		rno = a;
		name = b;
	}

	void showData() 
        {
		System.out.println(rno+" "+name);
	}
}

public class StdData{

	public static void main(String args[]) {

		Student std1 = new Student();

		std1.setData(01, "Aarti Patil");
		std1.showData();
	
		Student std2 = new Student();

		std2.setData(02, "Rohan Patil");
		std2.showData();
	}
	
}