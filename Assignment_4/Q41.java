
/*41.	Write a program to demonstrate this() 
construct functionality. */
import java.util.*;

class This_Construct{
	
	private int stdId;
	private String stdName;
	
	This_Construct() 
        {		
	    this(123, "AARTI PATIL");
	}
	
	This_Construct(int stdId) 
        {
	    this(stdId, "ROHAN PATIL ");
	}
	
	This_Construct(String stdName) 
        {
	    this(103, stdName);
	}
	
	This_Construct(int stdId, String stdName) 
        {
	    this.stdId = stdId;
	    this.stdName = stdName;
	}
	
	void showRecord() 
        {		
	    System.out.println("Students details = stdId : "+stdId+" stdName : "+stdName);
	}
}

public class This_Construct_Demo{
	
	public static void main(String args[]) 
        {
		
		This_Construct obj1 = new This_Construct();
		obj1.showRecord();
		
		This_Construct obj2 = new This_Construct(201);
		obj2.showRecord();
		
		This_Construct obj3 = new This_Construct("DIPAK PATIL");
		obj3.showRecord();
		
		This_Construct obj4 = new This_Construct(523, "RAJ PATIL");
		obj4.showRecord();
	}
}