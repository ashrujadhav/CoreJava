//20.	Print all prime numbers between two given numbers. [ break continue ]

import java.util.Scanner;
class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int firstnum = sc.nextInt();
		int secondnum = sc.nextInt();
		int count=0;
		for(int i=firstnum;i<=secondnum;i++){
			//Inner:
			for(int j=2;j<i && j<secondnum;j++){
				if(i%j==0){
					count++;
					System.out.println(i+" number is not prime");
					break;
					//break Inner;
				}
				count=0;
			}
		if(count==0){
			System.out.println(i+" number is prime");
		}
		}
	}
}