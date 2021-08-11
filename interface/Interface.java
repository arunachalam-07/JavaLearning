import java.lang.*;

interface Animal
{
	public void eat();
	public void walk();
}

interface Carnivore extends Animal
{
	 void  need_meat();
	
}

class Cougar implements Carnivore
{

	Cougar()
	{
		System.out.println("Hi i am messi cougar");
	}
	public void eat()
	{
		System.out.println("I will eat");
	}

	public void walk()
	{
		System.out.println("I will walk");
	}

	public void need_meat()
	{
		System.out.println("I need meat");
	}
}

class Interface
{
	public static void main(String[] args)
	{
		Carnivore messi=new Cougar();
		messi.eat();
		messi.walk();
		messi.need_meat();
	}

}
