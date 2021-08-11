import java.lang.*;
import java.util.Scanner;

class GetBits1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x,p,n;
		System.out.println("Enter value of x");
		x=sc.nextInt();
		System.out.println("Enter value of p");
		p=sc.nextInt();
		System.out.println("Enter value of n");
		n=sc.nextInt();

		System.out.println((x>>(p+1)-n)& ~(~0<<n));
	}

}

