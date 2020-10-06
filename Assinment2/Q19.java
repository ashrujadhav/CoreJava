//19.	Calculate  series : 12+22+32+42+.........+n2

class Q19{
	public static void main(String args[]){
		int num=10;
		int range=5;	
		int sum=2;	
		for(int i=0;i<range;i++){
			sum=sum+num;
			System.out.print(+sum);
			if(i<range-1){
			System.out.print("+");	
			}
		}
		
	}	
}