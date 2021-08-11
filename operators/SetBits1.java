import java.lang.*;
import java.util.Scanner;

class SetBits1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int x,p,n,y;
		System.out.println("Enter value of x");
		x=sc.nextInt();
		System.out.println("Enter value of p");
		p=sc.nextInt();
		System.out.println("Enter value of n");
		n=sc.nextInt();
		System.out.println("Enter value of y");
		y=sc.nextInt();
		System.out.println(((y>>n)<<n)+((x>>(n-1))&(~(~0<<n))));
		System.out.println((x|y)&(~(~0<<n))<<n-1);
	}
}
