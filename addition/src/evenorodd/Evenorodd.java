package evenorodd;

import java.util.Scanner;
public class Evenorodd 
{
		public static void main(String[] args)
		{
			int num;
			System.out.println("Enter any Number: ");
			Scanner scan=new Scanner(System.in);
			num=scan.nextInt();
			if(num%2==0)
				System.out.println("The Entered Number"+num+ "is Even");
			else
				System.out.println("The Entered Number"+num+ "is Odd");
		}
	}
