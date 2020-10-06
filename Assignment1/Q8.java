/*08.	Write a program to find the simple interest. 
Take the principle amount, rate of interest and time from user using Scanner class
*/

import java.util.Scanner;
class Q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal");
		int p = sc.nextInt();
		System.out.println("Enter Rate");
		int r = sc.nextInt();
		System.out.println("Enter Time");
		int t = sc.nextInt();
		
		double si = (p*t*r)/100;
		System.out.println("Simple Intrest = "+si);
	}
}