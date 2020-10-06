/* 35.	Create a class MathOperation
 that has four static methods. add() 
method that takes two integer numbers as 
parameter and returns the sum of the numbers. 
subtract() method that takes two integer numbers 
as parameter and returns the difference of the numbers.
 multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered 
numbers and prints the return values of every method 

*/
import java.util.Scanner;

class MathOperation{
	static void sum(int num1,int num2) {
		int add = num1+num2;
		System.out.println("addition of two number: "+add);		
	 }


	 static void subtract(int num1,int num2) {
			int subtraction = num1-num2;
			System.out.println("subtraction of two number: "+subtraction);
			 
	 }



	static void multiply(int num1,int num2) {
		int mul = num1*num2;
		System.out.println("multiply of two number: "+mul);
	
	}


	static void power(int base,int expo) {
		int res=1;
		while(expo!=0)
		{
			 res *= base;
			expo--;
		}
		System.out.println("power of number: "+res);
		
	}
}



public class Q35 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		
		MathOperation.sum(num1, num2);
		MathOperation.subtract(num1, num2);
		MathOperation.multiply(num1, num2);
		MathOperation.power(num1, num2);
}
	
}
