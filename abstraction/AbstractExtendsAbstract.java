import java.lang.*;

abstract class Animal
{
	abstract void eat();
	abstract void walk();
}

abstract class Puma extends Animal
{
	abstract void name();
}


class Messi extends Puma
{
	void eat()
	{
		System.out.println("I am eating");
	}
	void walk()
	{
		System.out.println("I am walking");
	}
	void name()
	{
		System.out.println("I am puma");
	}
}

class AbstractExtendAbstract
{
	 
	public static void main(String[] args)
	{
		System.out.println("Normal object creation");
		Messi m =new Messi();
		m.name();
		m.walk();
		m.eat();
		
		System.out.println("Puma object creation");
		Puma p=new Messi();
		p.name();
		p.walk();
		p.eat();

		System.out.println("Animal object creation");
		Animal a=new Messi();
		a.walk();
		a.eat();
		
	}
}
