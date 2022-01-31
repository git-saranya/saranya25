package pyramidexample;
import java.util.Scanner;
public class FloydTriangle
{	
	public static void main(String args[])
	{   
		int number=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No of Rows: ");
		int rows=scan.nextInt();
		System.out.println("FLOYD TRIANGLE:");
		System.out.println("****************");
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number +" ");
				number++;
			}
			System.out.println();
		}
	}
}
