package pkg_52;

import java.util.Scanner;

public class StringVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String str = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<str.length(); i++)
                {			
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') 
                        {	
				count++;
			}
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') 
                        {
				count++;
			}
		}
		
		System.out.println("The count of vowels in given string is : "+count);
		
		sc.close();

}
}