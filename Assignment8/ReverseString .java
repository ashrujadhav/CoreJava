package pkg_52;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string for reverse it.");
		String inp = sc.nextLine();
				
		String rev = "";
		for(int i=input.length()-1; i>=0; i--) 
                {    rev = rev + input.charAt(i);    }          						
                
		System.out.println(rev);
}
}