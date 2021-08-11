import java.lang.*;
import java.util.Scanner;

class BoxingAndUnboxing
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("boxing and unboxing");
		Integer i=sc.nextInt();
		System.out.println("Integer "+i);
		
		Boolean b=new Boolean("true");
		System.out.println("Boolean "+b.booleanValue());

		System.out.println("Integer object to a numeric String");
		Integer j=new Integer(sc.nextInt());
		String s=j.toString();
		System.out.println(j);
	}
}
