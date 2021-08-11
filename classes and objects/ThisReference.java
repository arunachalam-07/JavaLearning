import java.lang.*;
import java.util.Scanner;

class ThisReference
{
	int n;

	ThisReference(int n)
	{
		System.out.println("Using this reference");
		this.n=n;
		System.out.println("printed instance variable value");
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int n1=sc.nextInt();
		ThisReference obj=new ThisReference(n1);
	}
}
