import java.lang.*;


class Clone_Class implements Cloneable
{
protected Object clone()throws CloneNotSupportedException
{
	return super.clone();
	
}


}


class Cloneable2
{



	public static void main(String[] args)throws CloneNotSupportedException
	{
		Clone_Class c1=new Clone_Class();
		Clone_Class c2=(Clone_Class)c1.clone();
		Clone_Class c3=(Clone_Class)c2.clone();
		System.out.println(c1.getClass()+" "+c2.getClass()+" "+c3.getClass());
		System.out.println(c1.hashCode()+" "+c2.hashCode()+" "+c3.hashCode());
	}
}
