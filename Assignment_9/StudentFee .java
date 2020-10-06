package Std;
import java.util.*;

interface StudentFee
{
	int getFee() throws Exception;
}
class StudentChild implements StudentFee{
	private int fee;
	public int getFee() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee : ");
		fee=sc.nextInt();
		if(fee<=0 || fee >100000)
		{
			throw new Exception("Invalid fee");
		}
		return fee;
	}
}
public class StudentFee {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			StudentChild c=new StudentChild();
			System.out.println(c.getFee());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
			
	}

}