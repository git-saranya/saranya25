package addition;
import java.util.Scanner;
public class Addition 
{
     public static void main(String[] args) 
     {   
    	 System.out.println("Enter two numbers : ");
    	 int first=250;
    	 int second=500;
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter your First Number: ");
         first=scan.nextInt();
         System.out.println("Enter your Second Number: ");
         second=scan.nextInt();          
    	 System.out.println(first+" "+second);
    	 int sum=first+second;
    	 System.out.println("The Sum is "+sum);
     }
}
