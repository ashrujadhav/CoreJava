/*13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
*/
import java.util.Scanner;
//Using If else
class Q13{
	public static void main(String args[]){
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("Num1 is greatest");
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("Num2 is greatest");
		}
		else{
			System.out.println("Num3 is greatest");
		}
	}
}

//Using Ternary Operator
class Q13Ternary{
	public static void main(String args[]){
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//(num1>num2 && num1>num3)?"Num1 is greatest":(num2>num3 && num2>num3)?"Num2 is greatest":"Num3 is greatest";
		//num1>num2)?num1>num3)?"Num1 is greatest":"Num3 is greatest":(num2>num3)?"num2 is greatest":"num3 is greatest";
		int num = (num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;
		System.out.println("Gretest number is = "+num);
	}
}
