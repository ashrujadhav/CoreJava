//16.	Write a program to print table of any entered number using loop.

import java.util.Scanner;
class Q16{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=10;i++){
			int sum = num*i;
			System.out.println(num +"x"+ i +"="+ sum);
		}
	}
}