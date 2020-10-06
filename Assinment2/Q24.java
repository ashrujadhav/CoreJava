//24.	Write a program to search an element in the array.
import java.util.Scanner;
class Q24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				count++;
				System.out.println("Number found");
				break;
			}
		}
		if(count!=1){
			System.out.println("Number Not found");
		}
	}
}