//11.	Write a program to swap two numbers without using third variable.
import java.util.Scanner;
class Q11{
	public static void main(String []args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("====================");
		System.out.println("After Swap");
		a = (a+b);
		b = (a-b);
		a = (a-b);
		System.out.println("Number 1 = "+a);
		System.out.println("Number 2 = "+b);
	}
}