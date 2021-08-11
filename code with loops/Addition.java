import java.lang.*;
import java.util.Scanner;

class Addition
{
	static public  void  main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=(int)(Math.random()+1)*10;
		int n2=(int)(Math.random()+1)*10;

		System.out.println("Enter addition of "+n1+"+"+n2);
	
		int ans=sc.nextInt();

		if(ans==(n1+n2))
		{
			System.out.println("You entered right");
		}

		else
		{
			while((n1+n2)!=ans)
			{
				System.out.println("Try again");
				n1=(int)(Math.random()+1)*10;
				n2=(int)(Math.random()+1)*10;
				System.out.println("Enter addition of "+n1+"+"+n2);
				ans=sc.nextInt();
				
			}
			System.out.println("You guessed right");
		}
	}
}
