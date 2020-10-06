import java.util.*;

class Person{
	
	private int age;
	private String name;
	
	Person(){
		
		this(30, "Rohan Patil");
	}
	
	Person(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	void showRecord() {
		
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}
}

/* 47.	Create a program to demonstrate constructor chaining.*/
class Emp extends Person{
	
	private String dept;
	
	Emp() {
		
		this(27, "Aarti Patil", "CDAC");
	}
	
	Emp(int age, String name, String dept) {
		
		super(age, name);
		this.dept = dept;
	}
	
	void showRecord() {
		
		super.showRecord();
		System.out.println("dept : "+dept);
	}
}

public class Q47{
	
	public static void main(String args[]) {
		
		Person arr[] = {new Person(), new Emp()};
		
		for(Person trav : arr) {
			
			trav.showRecord();
		}
	}
}
