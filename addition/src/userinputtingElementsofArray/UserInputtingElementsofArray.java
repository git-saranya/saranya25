package userinputtingElementsofArray;
import java.util.Scanner;
public class UserInputtingElementsofArray
{
	public static void main(String args[])
	{
		int[] array=new int[10];
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Elements of Array: ");
    	for(int i=0;i<=5;i++)
		{			
		    array[i]=scan.nextInt();
		}
		for(int num:array)
		{
		     sum=sum+num; 	
		}
		System.out.println("The Sum of Elements of Array: " +sum);
	}
}
