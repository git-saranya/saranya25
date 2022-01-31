package areaofSquare;
import java.util.Scanner;
public class AreaofSquare 
{
	public static void main(String args[])
 {
   	Scanner scan=new Scanner(System.in);
  	System.out.println("Enter the Side of Square: ");
   	double side=scan.nextDouble();
   	double area=side*side;
   	System.out.println("Area of Square: "+area);
  }
}



