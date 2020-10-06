/*05.	Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.
*/

import java.util.Scanner;
class Q5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Welcome "+str);
	}
}