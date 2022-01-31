package whileloop;
import java.util.Scanner;
public class Whileloop 
{
	public static void main(String args[])
	{
		int number;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number below 10 : ");
		number=scan.nextInt();
	    while(number<=10)
	    {
	        sum=sum+number;
	    	number++;
	    }	
	    System.out.format("The sum of numbers from while loop is %d is", sum);
	}
}
