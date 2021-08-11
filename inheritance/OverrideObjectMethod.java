import java.lang.*;

class OverrideObjectMethod extends Object
{
	static OverrideObjectMethod m3=new OverrideObjectMethod();
	static String toString(OverrideObjectMethod m1)
	{
		System.out.println("our own method");
		String s=m1.toString();
		return s;
	}

	static
	{
		System.out.println("default method");
	
		System.out.println(m3);
	}

	public static void main(String[] args)
	{
		OverrideObjectMethod obj=new OverrideObjectMethod();
		System.out.println(obj.toString(obj));
		
	}
}

