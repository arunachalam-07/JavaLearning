import java.lang.*;


class StaticTest
{
	public static void main(String[] args)
	{

		NonStatic obj1= new NonStatic();
		NonStatic obj2=new NonStatic();
		NonStatic obj3=new NonStatic();
		System.out.println("non static instance variable");
			obj1.increment();
			obj1.display();
			obj2.increment();
			obj2.display();
			obj3.increment();
			obj3.display();

		System.out.println("Non-static is done");

		System.out.println("Static instance variable");

		Static obj4=new Static();
		Static obj5=new Static(); Static obj6=new Static();
		obj6.increment();
		obj6.display();
		obj5.increment();
		obj5.display();

		obj4.increment();
		obj4.display();
		System.out.println("Static is done");
	
	}
}		


class NonStatic
{
	int a;

void increment()
{
	System.out.println("before increment value of a is "+a);
	a++;
}

void display()
{
	System.out.println("after increment value of a is "+a);
}

}


class Static
{
	static int a;

static void increment()
{
	System.out.println("before increment value of a is "+a);
	a++;
}

static void display()
{
	System.out.println("after increment value of a is "+a);
}

}
