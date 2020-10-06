//18.	Program to check whether number is prime or not.

import java.util.Scanner;
class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int count=0;
		if(num==0 ){
			System.out.println("Enter valid number");
		}
		else if(num==1){
			System.out.println(num+" Number is nor prime nor composite");
		}
		else{
			for(int i=2;i<num;i++){
				if(num%i==0){
					count++;
					System.out.println(num+" Number is not prime");
					break;
				}
				
			}
		}
		if(count==0){
			System.out.println(num+" Number is prime");
		}
	}
}