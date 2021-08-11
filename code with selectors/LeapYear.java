import java.lang.*;
import java.util.Scanner;

class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter an year");
		
		int n=sc.nextInt();

		if((n%4==0) & (n%100!=0))
		{
			if(n%400==0)
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
