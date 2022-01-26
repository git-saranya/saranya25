package addition;
import java.util.scanner;
public class Addition 
{
     public static void main(String[] args) 
     {   
    	 System.out.println("Enter two numbers : ");
    	 int first=250;
    	 int second=500;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter your First Number: ");
      first=scan.NextInt();
      System.out.println("Enter your Second Number: ");
      second=scan.NextInt();          
    	 System.out.println(first+" "+second);
    	 int sum=first+second;
    	 System.out.println("The Sum is "+sum);
     }
}
