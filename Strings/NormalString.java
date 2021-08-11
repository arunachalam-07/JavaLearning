import java.lang.*;
import java.util.Scanner;

class NormalString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=new String(sc.nextLine());
		String s2="puma messi";
		char[] arr=new char[]{'p','u','m','a',' ','m','e','s','s','i'};
		String s3=new String(arr);
	
		System.out.println("String concat "+s1+s2);
		System.out.println("String replace "+s2.replace('p','r'));
		s2="puma messi";
		System.out.println("checking reference "+s1==s2);
		System.out.println("checking refernce "+s1==s3);
		System.out.println("Equality of String1 "+s1.equals(s2));
		System.out.println("Equality of String2 "+s2.equals(s3));
		System.out.println("Comparsion of String 1 "+s1.compareTo(s2));
		System.out.println("Comparsion of String 2 "+s2.compareTo(s3));
		System.out.println("string1 length "+s1.length());
		System.out.println("string2 length "+s2.length());
		System.out.println("charr arr length "+arr.length);
		System.out.println("String3 length "+s3.length());
		System.out.println("character extraction from string1 "+s1+" "+s1.charAt(0));
		System.out.println("Substring from a String "+s1.substring(0,5));
		System.out.println("Index of s1 "+s1.indexOf("a"));
		String str="puma#messi#";
		System.out.println("String split puma#messi#"+(str.split("#")));
		System.out.println("Removing a whitespace   puma   "+("   puma   ".trim()));
		System.out.println("Pattern matching "+s1.matches("puma.*"));
		System.out.println("Uppercase "+s1.toUpperCase());
		System.out.println("Lowercase "+s2.toLowerCase());
	}
}
		
