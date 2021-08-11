import java.lang.*;

class Monkey
{

}

class Objects
{
	public static void main(String[] args)
	{
		Monkey m1=new Monkey();
		Monkey m2=new Monkey();
		Monkey m3=new Monkey();
		Monkey m4=m1;
	
		System.out.println("Hash code");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(" ");
		System.out.println("equals");
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m4));
		
		System.out.println();
		System.out.println("get class");
		System.out.println(m1.getClass());
		System.out.println(m2.getClass());
		System.out.println(m3.getClass());
		System.out.println();
		System.out.println("to String");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());

		
	}



}

