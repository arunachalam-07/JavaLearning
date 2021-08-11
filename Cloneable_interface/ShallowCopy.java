import java.lang.*;

class Department
{
	int id;
	String name;

Department(int id,String name)
{
		this.id=id;
		this.name=name;
}


}

class Student implements Cloneable
{
	int id;
	String name;
	Department dep;
Student(int id,String name,Department dep)
{
	this.id=id;
	this.name=name;
	this.dep=dep;
}

protected Object clone() throws CloneNotSupportedException
{
	return super.clone();
}

}


class ShallowCopy
{
	public static void main(String[] args)
	{
		Department d1=new Department(104,"CSE");
		Student s1=new Student(007,"Arun",d1);
		Student s2=null;
		try
		{
			s2=(Student)s1.clone();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		System.out.println(s1.dep.name);
		s2.dep.name="cougar";
		System.out.println("Object 1");
		System.out.println(s1.dep.name);
		System.out.println("Object 2");
		System.out.println(s2.dep.name);

	}
}
