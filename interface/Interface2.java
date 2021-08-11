import java.lang.*;


interface Edible
{
	void eat();
}

abstract class Animal
{
	Animal()
	{
		System.out.println("I am Animal");
	}
	abstract void walk();
}

abstract class Fruit implements Edible
{
	
}

class Apple extends Fruit
{
	Apple()
	{
		System.out.println("I am apple");
	}
	public void eat()
	{
		System.out.println("I am edible");
	}
}

class Chicken extends  Animal
{
	Chicken(){
		super();
		System.out.println("I am chicken");
	}

	public void eat()
	{
		System.out.println("I am edible");
	}

	void walk()
	{
		System.out.println("I can walk");
	}
}

class Interface2
{
	public static void main(String[] args)
	{
		Fruit a=new Apple();
		a.eat();
	
		Chicken c =new Chicken();
		c.eat();
		c.walk();
}

}
