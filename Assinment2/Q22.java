//22.	Sort a ten element array in descending order.
class Q22{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int rev,ans;
		int i;
		System.out.println("Ascending order");
		for(i=0;i<10;i++){
			ans=arr[i];
			System.out.println(ans);
		}
		System.out.println("Descending order");
		for(int j=9;j>=0;j--){
			rev = arr[j];
			System.out.println(rev);
		}
	}	
}