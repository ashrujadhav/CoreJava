package pkg_52;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string input : ");
		String inp = sc.nextLine();	
		
		String arr[] = inp.split(" ");
		
		String res = "";
		
		for(String trav : arr) 
                {
			String word = "";
			for(int i=trav.length()-1; i>=0; i--) 
                        {
			  word = word + trav.charAt(i);
			}
			res = res + word + " ";
		}
		
		System.out.println(res);
}

}