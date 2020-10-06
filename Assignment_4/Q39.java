/* 39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )
 */
import java.util.*;

class Product{
	
	private int pid;
	private int price;
	private int quantity;
	
	Product(int pid, int price, int quantity){
		
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	static int totalAmtSpent(int arr[][]) {
		
		int AllProductAmt = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			int singleProductAmt = (arr[i][1] * arr[i][2]);
			AllProductAmt = AllProductAmt + singleProductAmt;
		}
		
		return AllProductAmt;
	}
}

public class ProductDemo{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of products.");
		int size = sc.nextInt();
		
		int arr[][] = new int[size][3];
		
		int pid = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(j==0) {
					
					arr[i][j] = pid;
					pid++;
				}
				
				if(j==1) {
					
					System.out.println("Enter the price of "+(i+1)+" product : ");
					arr[i][j] = sc.nextInt();
				}
				
				if(j==2) {
					
					System.out.println("Enter the quantity of "+(i+1)+" product : ");
					arr[i][j] = sc.nextInt();
				}
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			Product obj = new Product(arr[i][0], arr[i][1], arr[i][2]);
		}

		System.out.println("============================================");

		for(int arr1[]: arr) {
			
			for(int trav : arr1) {
				
				System.out.print(" "+trav);
			}
			
			System.out.println(" ");
		}
		 
		System.out.println("============================================");
				
		int highest = 0;
		int hPid = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(i==0) {
				
				highest = arr[i][1];
				hPid = arr[i][i];
			}
				
			if(highest<arr[i][1]) {
			
				highest = arr[i][1];
				hPid = arr[i][0];
			}
		}
		
		System.out.println("The pid of highest price and price of product among all products - pid : "+hPid+" price : "+highest);

		System.out.println("============================================");

		int outputAmt = Product.totalAmtSpent(arr);
		System.out.println("The total amount spent on all products is : "+outputAmt);
		
		System.out.println("============================================");
	}
}