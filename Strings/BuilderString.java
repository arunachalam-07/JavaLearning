import java.lang.*;
import java.util.Scanner;
class BuilderString
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	StringBuilder bu=new StringBuilder(sc.nextLine());

	System.out.println("string append"+bu.append("messi cougar"));
	System.out.println("delete a char from a string "+bu.delete(0,4));
	System.out.println("String replace "+bu.replace(0,5,"puma"));
//	System.out.println("Set a char "+bu.setCharat(0,'q'));
	System.out.println("insert a char in string "+bu.insert(0,'a'));
	System.out.println("String reverse "+bu.reverse());
	}
}

