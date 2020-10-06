package pkg_52;

import java.util.Scanner;

public class FirstLetterUpper {

	        public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string input : ");
		String input = sc.nextLine();
		
		String arr[] = input.split(" ");
		
		String res = "";

		for(String trav : arr) 
                {			
                        String first = trav.substring(0,1);
			String rest = trav.substring(1);
			result = res+first.toUpperCase()+rest.toLowerCase()+" ";
	        }
		
		System.out.println(result);
}

}