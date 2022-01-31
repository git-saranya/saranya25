package multiplytwonos;

import java.util.Scanner;
public class Multiplytwonos
{
	public static void main(String args[])
	{   int firstno;
	    int secondno;
	    int mul;
	    Scanner reader=new Scanner(System.in);
		System.out.println("Enter value of First No: ");
		firstno=reader.nextInt();
		System.out.println("Enter value of Second No: ");
		secondno=reader.nextInt();
		mul=firstno*secondno;
		System.out.println("The Multiplication of Two Numbers is : " +mul);
}
}