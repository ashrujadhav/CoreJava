package pkg_52;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String weekdays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		System.out.println("Enter the number for searching day.");
		int input = sc.nextInt();
		
		try { System.out.print("The day with respect to your input : "+weekdays[input-1]); }
					
		catch(ArrayIndexOutOfBoundsException exp) 
                {  System.out.println("Please provide the correct input between 1 to 7."); }
			
}

}