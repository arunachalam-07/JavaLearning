import java.lang.*;
import java.util.Scanner;

class Gcd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,rem;
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();

		while(b!=0)
		{
			rem=a%b;
			a=b;
			b=rem;
		}
		System.out.println("gcd is "+a);
	}
}
