
/* */
import java.util.*;

class Animal{
	
	void showRecord() 
    {		
		System.out.println("calling Aniaml showRecord() method");
	}
	
	void getData() 
    {		
		System.out.println("calling Aniaml getData() method");
	}
}


/*46.	Create a program to demonstrate the use of instanceof operator
 or secure reference down casting. */

class Dog extends Animal{
	
	void showRecord() 
	{	
		System.out.println("Calling Dog's showRecord() method.");
	}
	
	void displayRecord() 
	{	
		System.out.println("Calling Dog's displayRecord() method ");
	}
}

public class Downcasting_Instanceof{
	
	public static void main(String args[]) {
		
		Animal arr[] = {new Dog(), new Animal()};
		
		for(Animal trav : arr) {
			
			if(trav instanceof Dog) {
			
				Animal obj = (Dog)trav;
			
				obj.showRecord();
				obj.getData();
				// obj.displayRecord();
			}
		}
	}
}