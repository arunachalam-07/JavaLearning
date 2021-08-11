import java.lang.*;


class Department implements Cloneable
{
	int id;
	String name;
Department(int id,String name)
{
	this.id=id;
	this.name=name;
}

protected Object clone() throws CloneNotSupportedException
{
		return super.clone();
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

public String toString()
{
	return id+"-"+name+"-"+"-->"+dep.id+"--"+dep.name;
}

}

class DeepCopy
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Department d1=new Department(104,"CSE");
		Student s1=new Student(007,"Arunachalam",d1);
		System.out.println(s1.toString());
		Student s2=null;
		s2=(Student)s1.clone();
		s2.dep=(Department)d1.clone();
		s2.name="puma";
		s2.id=001;
		s2.dep.id=100;
		s2.dep.name="Animal";
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.toString());
	}
}
