import java.lang.*;
import java.util.Scanner;
class String_Clone
{

public String temp_clone(String s1)throws CloneNotSupportedException
{
	try
	{
		return (s1)(Object.clone());
	}
	catch(Exception e)
	{
		return e.toString();
	}
}
public void get(String s1)
{
	String s=s1;
	String s2=temp_clone(s);
	System.out.println(s);
	System.out.println(s2);
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String_Clone obj=new String_Clone();
		obj.get(s1);
	}
}
