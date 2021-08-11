import java.lang.*;
import java.util.regex.*;
import java.util.Scanner;

class Regex
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Pattern p=Pattern.compile("[012][0-99]][0-9].");
		String s=sc.nextLine();
		Matcher m=p.matcher(s);
		System.out.println(m.find());
	}
}
