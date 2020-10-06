/* 36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/
class MathOperation{
    
    static void multiply (int num1 , int num2){
        int ans1 = num1*num2;
        System.out.println("The multiplication of Two integers numbers :"+ans1);
    }


    static void multiply (float num1, float num2, float num3){
        float ans2 =num1*num2*num3;
        System.out.println("The multiplication of Three float numbers :"+ans2);
        
    }

    static void multiply(int arr[]) {
		
		int ans3 = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			ans3 = ans3 * arr[i];
		}
		
		System.out.println("The multiplication of all array elements is : "+ans3);
	}

    static void multiply (double num1, int num2){
        double ans4 =num1*num2;
        System.out.println("The multiplication of one double and one integer  numbers :"+ans4);
        
    }
}

class Q36{
    public static void main(String argc []){

        MathOperation.multiply(11,22);

        MathOperation.multiply(11f,22.05f,3.33f);

        int arr[] = new int[] {11, 22, 33};

	MathOperation.multiply(arr);

        MathOperation.multiply(11.01,22);

    }
}
