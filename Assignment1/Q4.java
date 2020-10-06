/*04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store 
in a byte type of variable. [Note: primitive down casting is required in this program ] .*/

class Q4{
	public static void main (String arge[]){
		byte b1 = 126;
		byte b2 = 10;
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);
	}
}

/* Ans == 136
class Q4{
	public static void main (String arge[]){
		byte b1 = 126;
		byte b2 = 10;
		short b3 = (short)(b1+b2);
		System.out.println(b3);
	}
}
*/