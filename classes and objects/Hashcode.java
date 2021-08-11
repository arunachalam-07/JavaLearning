import java.lang.*;

import java.util.Scanner;

class HumanBeing{

	HumanBeing()
	{
		this("puma");
		System.out.println("Just a human being");
	}

	HumanBeing(String name)
	{
		this("puma","messi");
		System.out.println("Test1");
		System.out.println(name);
	}

	HumanBeing(String n,String n1)
	{
		System.out.println("Test 2");
		System.out.println(n+" "+n1);
	}
	void eat()
	{
		System.out.println("eat");
	}

	void run()
	{
		System.out.println("run");
	}
	void test(HumanBeing this)
	{
		System.out.println(this);
	}

}
class HashCode
{
	public static void main(String[] args)
	{
		System.out.println("Test 01");
			HumanBeing B=new HumanBeing();
		System.out.println("Test 02");
			B=new HumanBeing("juju");
		System.out.println("Test 03");
			B=new HumanBeing("carmel","white");
		System.out.println("Test 04");
			System.out.println(B);
			B.test();
			
	}
}
