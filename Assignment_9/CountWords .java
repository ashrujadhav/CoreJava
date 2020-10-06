package pkg_52;

import java.util.Scanner;

public class CountWords {

	        public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string input.");
		String input = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<input.length(); i++) 
                {	
		count++;
		}
		
		System.out.print("The count of words in given string : "+count);
}

}