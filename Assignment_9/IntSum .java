package pkg_52;

import java.util.Scanner;

public class IntSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.nextLine();
		String arr[] = inp.split(" ");
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) 
                {  sum = sum + Integer.parseInt(arr[i]); }
				
		System.out.println("Sum of given number : "+sum);
}
}