package largestofThreeNos;

public class LargestofThreeNos 
{
	public static void main(String args[])
	{
		float n1=-40.5f, n2=50.3f, n3=86;
		if(n1>n2&&n1>n3)
		System.out.println("The Largest of Three Numbers is: " +n1);
		else if(n2>n1&&n2>n3)
			System.out.println("The Largest of Three Numbers is: " +n2);
		else
			System.out.println("The Largest of Three Numbers is: " +n3);
	}
}
