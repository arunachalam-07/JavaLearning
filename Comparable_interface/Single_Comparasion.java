import java.lang.*;
import java.util.Scanner;

class Comparasion implements Comparable<Comparasion>
{
String str;

public void set(String str)
{
	this.str=str;
}

public void get()
{
	System.out.println(str);
}

public int compareTo(Comparasion c)
{
	int status=0;
	if((this.str).compareTo(c.str)>0)status=1;

	else if((this.str).compareTo(c.str)<0)status=-1;

	else if((this.str).equals(c.str))status=0;
	return status;
}

}


class Single_comparasion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String s=sc.nextLine();
System.out.println("Compare object 1");
		Comparasion c1=new Comparasion();
		c1.set(s);
		c1.get();
System.out.println("Compare object 2");
		s=sc.nextLine();
		Comparasion c2=new Comparasion();
		c2.set(s);
		c2.get();
System.out.println("comparsion_1");
		System.out.println(c1.compareTo(c2));
System.out.println("Comparsion 2");
		System.out.println(c2.compareTo(c1));
	}
}
