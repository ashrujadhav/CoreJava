/* 28.	Initialize one String type of array and print the elements using for each loop.*/
import java.util.*;

public class Q28{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String[] arrData = new String[] {"Aarti", "Rohan", "Dipak", "Akash", "Sanchita"};
               
                System.out.println("Elements of string type array : ");
                
                for(int i=0; i< arrData.length; i++){
                System.out.println(arrData[i]);
                }

		/* for(String trav : arrData) 
                {
			System.out.print(" "+trav);
		} 
                 */

	}
}
