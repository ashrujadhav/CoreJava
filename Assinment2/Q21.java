//21.	Program to show sum and average of 10 element array.
//Accept array elements from user.
import java.util.Scanner;
class Q21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum=0,avg;
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
		}
		avg = sum/arr.length;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
	}
} 