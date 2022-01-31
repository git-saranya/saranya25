package nestedSwitchCase;
import java.util.Scanner;
public class NestedSwitchCase 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value for tech: ");
		int tech=scan.nextInt();
		System.out.println("Enter the value for course: ");
		int course=scan.nextInt();
		switch(tech)
		{
		case 1:
			System.out.println("Python");
			break;
		case 2:
			switch(course)
			{
			case 1:
			    System.out.println("J2EE");
				break;
			case 2:
				System.out.println("Advance Java");
				break;
			default :
				System.out.println("Not Listed");
			}
		}
}}
			
			