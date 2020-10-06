
/* 27.	Write a program to fine the smallest and greatest number present in the
 array of integer type.*/class Smallest_Greatest{
	
	public static void main(String args[]){
		int num[] = {22,45,78,99,10};
		
		int smallest = num[0];
                int Greatest = num[0];
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i] > Greatest)
				Greatest = num[i];
			else if(num[i] < smallest)
				smallest = num[i];
		}
		
                System.out.println("biggest element =" + Greatest);
		System.out.println("smallest element =" + smallest);
	}
}