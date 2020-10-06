//25.	Write the program to find the sum of even elements and sum 
//of odd elements present in the array of integer type.

class Q25{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int oddsum=0;
		int evensum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evensum=oddsum+arr[i];
			}else{
				oddsum=evensum+arr[i];
			}
		}
		System.out.println("Odd Sum = "+oddsum);
		System.out.println("Even Sum = "+evensum);
	}	
}