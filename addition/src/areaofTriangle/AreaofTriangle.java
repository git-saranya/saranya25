package areaofTriangle;
import java.util.Scanner;
public class AreaofTriangle
{ 
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Base of Triangle: ");
		double base=scan.nextDouble();
		System.out.println("Enter the Height of Triangle: ");
		double height=scan.nextDouble();
		double area=(base*height)/2;
		System.out.println("Area of Triangle: " +area);
	}
}
