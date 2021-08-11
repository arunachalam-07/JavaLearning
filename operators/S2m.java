import java.lang.*;
import java.util.Scanner;

class S2m
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter seconds");
		int n;
		n=sc.nextInt();
		int min=n/60,rem=n%60;
		System.out.println("Minutes = "+n+"remaining seconds ="+rem);
	}
}
