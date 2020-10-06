
/*26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements. */
import java.util.*;

public class Sum_17Elements{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of rows for 2-D array : ");
		int row = sc.nextInt();
		int arr[][] = new int [row][];		

		for(int i=0; i<arr.length; i++) {

			System.out.println("Enter the value of columns for 1-D array : ");
			int col = sc.nextInt();
			arr[i] = new int[col];		

			for(int j=0; j<arr[i].length; j++) {

				System.out.println("Enter the "+(j+1)+" element of 1-D array : ");
				int input = sc.nextInt();
				arr[i][j] = input;
			}
		}

		System.out.println("Printing the 2-D array eles : ");

		for(int arr1[] : arr) {

			for(int trav : arr1) {

				System.out.print(" "+trav);
			}
			
			System.out.println(" ");
		}

		int sum = 0;
		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {

				sum = sum + arr[i][j];
			}
		}

		System.out.println("The sum of total elements is : "+sum);
	}
}