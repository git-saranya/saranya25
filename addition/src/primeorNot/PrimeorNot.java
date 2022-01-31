package primeorNot;
import java.util.Scanner;
public class PrimeorNot 
{
	public static void main(String args[])
	{
		int temp,n;
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number n: ");
		n=scan.nextInt();
		for(int i=2;i<=n/2;i++)
		{
		   temp=n%i;
		   if(temp==0)
		   {
		     	isPrime=false;
                break;		   
		   }
		}
		if(isPrime)
		{
			System.out.println("The Entered Number " +n+ " is Prime");
		}
		else
		{
			System.out.println("The Entered Number " +n+ " is not Prime");
		}
	}}
