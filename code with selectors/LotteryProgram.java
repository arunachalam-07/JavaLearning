import java.lang.*;
import java.util.Scanner;

class LotteryProgram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int ans=25;
		
		System.out.println("Enter your 2-digit lottery number");
	
		int n1=sc.nextInt();

		if(n1==ans)
		{
			System.out.println("You won 3 lakhs");
		}
		else if((n1/10==(ans%10))|(n1%10==(ans/10)))
		{
			System.out.println("You won 2 lakhs");
		}

		else if( n1/10==(ans%10) |(n1%10==ans/10) | (n1%10==ans%10) | (n1/10==ans/10))
		{
			System.out.println("You won 1 lakhs");
		}

		else 
		{
			System.out.println("You loss");
		}
	}
}
