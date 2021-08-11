import java.lang.*;


abstract class Shape
{
	abstract void draw();
}



class Circle extends Shape
{
	void draw()
	{
		System.out.println("I am circle");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("I am rectangle");
	}
}

class Rhombus extends Shape
{
	void draw()
	{
		System.out.println("I am Rhombus");
	}
}



class Upcasting
{
	public static void main(String[] args)
	{
		System.out.println("circle");
		Shape s1=new Circle();
			s1.draw();
		System.out.println("Rectangle");
		Shape s2=new Rectangle();
			s2.draw();
		System.out.println("Rhombus");
		Shape s3=new Rhombus();
			s3.draw();

		System.out.println("Runtime polymorphism");
		Shape[] arr={new Circle(),new Rectangle(),new Rhombus()};
		for(Shape s:arr)
		{
			s.draw();
		}
	}
}
