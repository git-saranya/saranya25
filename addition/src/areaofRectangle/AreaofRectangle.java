package areaofRectangle;
import java.util.Scanner;
public class AreaofRectangle 
{
    public static void main(String args[])
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the Length of Rectangle: ");
    	double length=scan.nextDouble();
    	System.out.println("Enter the breadth of Rectangle: ");
    	double breadth=scan.nextDouble();
    	double area=length*breadth;
    	System.out.println("Area of Rectangle: "+area);
    }
}
