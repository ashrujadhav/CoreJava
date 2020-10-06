/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.
*/

import java.util.Scanner;
class Q7{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		System.out.println("==================");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		int sum = s1+s2+s3+s4+s5;
		int tot = (sum/5);
		System.out.println(s1+s2+s3+s4+s5);
		System.out.println("percentage marks = "+tot+"%");
	}
}