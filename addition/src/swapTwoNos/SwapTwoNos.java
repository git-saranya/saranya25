package swapTwoNos;

import java.util.Scanner;
public class SwapTwoNos 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First No: ");
		int first=scan.nextInt();
		System.out.println("Enter the Second No: ");
		int second=scan.nextInt();
		System.out.println("Before Swap...");
		System.out.println("The First No is: " +first);
		System.out.println("The Second No is: " +second);
		int temporary=first;
		first=second;
		second=temporary;
		System.out.println("After Swap...");
		System.out.println("The First No is: " +first);
		System.out.println("The Second No is: " +second);
	}
}
