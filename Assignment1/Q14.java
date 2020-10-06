//14.	Program to check that entered year is a leap year or not.

import java.util.Scanner;
class Q14{
	public static void main(String... args){
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		year = sc.nextInt();
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.println(year+" is a leap year");
				}else{
					System.out.println(year+" is not a leap year");
				}
			}
			else{
				System.out.println(year+" is not a leap year");
			}
		}
		else{
			System.out.println(year+" is not a leap year");
		}
	}
}