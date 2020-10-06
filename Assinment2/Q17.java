//17.	Write a program to reverse a given number.

import java.util.Scanner;
class Q17{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int ans=0;
		int num3;
		while(num1!=0){
			num3 = num1%10;
			ans = ans*10+num3;
			num1 = num1/10; 
		}
		System.out.println(ans);
	}
}