package reverseofNumber;
import java.util.Scanner;
public class ReverseofNumber
{
	public static void main(String args[])
	{
		int n=0,revno=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of Number n: ");
		n=scan.nextInt();
		while(n!=0)
		{
			revno=revno*10;
			revno=revno+n%10;
			n=n/10;			
		}
	System.out.println("Reverse of a Number: " +revno);		
	}
}
