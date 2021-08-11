import java.lang.*;
import java.util.Scanner;

class SumOfnNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0,i;
		for(i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of "+n+" numbers"+sum);
	}
}

