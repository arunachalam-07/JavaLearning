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


class Student
{
	int id;
	String name;
	Department dept;
Student(int id,String name,Department dept)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
}



public String toString()
{
	return (id+" "+name+" "+dept.id+" "+dept.name);
}

}
class ShallowCopy
{
	public static void main(String[] args)
	{
		Student s1=new Student(7,"Arun",new Department(104,"CSE"));

		Student s2=s1;

		System.out.println(s1.toString());
		s2.name="cougar";
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}
}
