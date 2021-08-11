import java.lang.*;
import java.util.*;
import java.io.*;
class Kid_Sub
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=(int)Math.random()*10;
		int n2=(int)Math.random()*10;
		System.out.println("Subtraction of "+n1+"-"+n2);
		int ans=sc.nextInt();
		
		if((n1-n2)==ans)System.out.println("Correct answer");
		else System.out.println("Wrong answer");
	}
}
