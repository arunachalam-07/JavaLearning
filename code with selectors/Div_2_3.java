import java.lang.*;
import java.util.Scanner;

class Div_2_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");

		int n=sc.nextInt();

		if(n%2==0 & n%3==0)System.out.println("divide by both 2 and 3");
	
		else if(n%2==0 | n%3==0)System.out.println("divide by either 2 or 3");

		else if(n%2==0 ^ n%3==0)System.out.println("Either divide by 2 or 3 but not both");

	}

}
