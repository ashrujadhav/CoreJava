/* 33.	Write a program to demonstrate 
functionalities of this keyword in java. */
class Student{  
int rollno;  
String name;   
Student(int rollno,String name){  
this.rollno=rollno;  
this.name=name; 
}  
void display(){System.out.println(rollno+" "+name);}  
}  
class This_Demo{  
public static void main(String args[]){  
Student s1=new Student(001,"Ashruba");  
Student s2=new Student(002,"Rohit");  
s1.display();  
s2.display();  
}}  