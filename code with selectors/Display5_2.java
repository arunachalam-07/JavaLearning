import java.lang.*;
import java.util.Scanner;

class Display5_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter an integer");
		
		int n=sc.nextInt();

		if((n%5)==0)System.out.println("hello 5");
		
		else if((n%2==0))System.out.println("hello 2");
		
		else System.out.println("No idea");
	}
}

