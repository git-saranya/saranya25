package typecasting;

public class Typecasting 
{
	public static void main(String args[])
	{
		byte a=10;
		int i=a;              // Type cast- integer accept byte value
		//byte b=i;           Throw Error - Higher type value cannot be put in Lower type value
	    byte c= (byte)i;
		byte x=15;
		byte y=10;
		//byte multiply = x * y;  Throw Error - Arithmetic Operation of two bytes values result integer type value
		int mul = x * y;
		System.out.println("The Multiplication of two bytes values is: " +mul);
	}
}
