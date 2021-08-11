import java.lang.*;

class NumbersBase
{
	int a=1,b=2;
	NumbersBase()
	{	this(0,0);
		System.out.println("Base Class");
		System.out.println(a+" "+b);
	}

	NumbersBase(int x,int y)
	{
		System.out.println("Base Class with arguments "+x+" "+y);
	}
}


class Test1 extends NumbersBase
{
	int c=3,d=4;

	Test1()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}


class Numbers
{
	public static void main(String args[])
	{
		System.out.println("Base class");
		NumbersBase obj1=new NumbersBase();
		System.out.println("Base class with parameterized constructor");
			obj1=new NumbersBase(1,2);
		System.out.println("Child Class");
		Test1 obj2=new Test1();
	}
}


