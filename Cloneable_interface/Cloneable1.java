import java.lang.*;


class Clone_Class implements Cloneable
{
	String fname,lname,color;
Clone_Class(String fname,String lname,String color)
{
	this.fname=fname;
	this.lname=lname;
	this.color=color;
}


protected Object clone() throws CloneNotSupportedException
{
	return super.clone();
}

}


class Cloneable1
{
	public static void main(String[] args)
	{
		Clone_Class c1=new Clone_Class("puma","messi","caramel");
		Clone_Class c2=null;
		try
		{
			c2=(Clone_Class)c1.clone();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}


		System.out.println(c1.color);
		c2.color="black";
		System.out.println(c2.color);
	}
}
