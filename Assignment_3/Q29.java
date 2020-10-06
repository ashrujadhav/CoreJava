/*29.	Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every
 one-D array present in the two-D arrays.*/

public class PrintEle{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows for 2-D array : ");
		int row = sc.nextInt();
		int arr[][] = new int[row][];

		for(int i=0; i<arr.length; i++) {

			System.out.println("Enter the value of columns of "+(i+1)+" 1-D array : ");
			int col = sc.nextInt();
			arr[i] = new int[col];
			System.out.println("Enter the value of elements of "+(i+1)+" 1-D array : ");
	
			for(int j=0; j<arr[i].length; j++) 
                        { arr[i][j] = sc.nextInt(); }
			

				
		}

		int flag = 1;

		for(int arr1[] : arr) {


			System.out.println("Elements of "+flag+" 1-D array : ");
			int counter = 0;

			for(int trav : arr1) {

				System.out.println(" "+trav);
				counter++;
			}
			
			System.out.println("Total elements in "+flag+" 1-D array are "+counter);
			System.out.println("=================================================");
			flag++;
		}
	}
}