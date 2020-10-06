import java.util.*;
/* 37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
class Person{
	
	private int age;
	private String Name;
	
	Person(String Name){
		
		this(18, Name);
	}
	
	Person(int age, String Name) {
		
		this.age = age;
		this.Name = Name;
	}
	
	void showRecord() {
		
		System.out.println("Details of person : age : "+age+" Person name : "+Name);
	}
}

public class PersonDemo{
	
	static public void main(String args[]) {
		
		Person obj1 = new Person("Aarti Patil");
		obj1.showRecord();
		
		Person obj2 = new Person(26, "Aarti Patil");
		obj2.showRecord();
	}
}