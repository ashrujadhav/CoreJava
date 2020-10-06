/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.
pi=3.14F
area=pi*rad*rad;
circle=2*pi*rad;
*/
import java.util.Scanner;
class Q6{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter Radius of circle");
		int rad = sc.nextInt();
		float pi = 3.14F;//(Literal Constant)
		float area = pi*rad*rad;
		float circle = 2*pi*rad;

		System.out.printf("Radius of a circle = %.3f\n",area);
		System.out.printf("Circumferance of circle = %.3f",circle);
		
	}
}