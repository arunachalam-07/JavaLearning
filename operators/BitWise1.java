import java.lang.*;
import java.util.Scanner;

class BitWise1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int i,j;

		System.out.println("Enter value of i");
		i=sc.nextInt();
		System.out.println("Enter value of j");
		j=sc.nextInt();

		int bit=(i<<3)+(j<<2);
		System.out.println(bit);
	}
}
