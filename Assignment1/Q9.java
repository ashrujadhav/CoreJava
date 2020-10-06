/*09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.
*/

import java.util.Scanner;
class Q9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ndays,year,months,week,days;
		System.out.println("Enter days");
		ndays = sc.nextInt();
		year = ndays/365;
		System.out.println("year = "+year);
		months = (ndays-365)/30;
		System.out.println("months = "+months);
		days =(ndays-365)%30;
		System.out.println("days = "+days);
	}
}