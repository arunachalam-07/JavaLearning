import java.lang.*;

class Teacher
{

	void giveAssignments()
	{
		System.out.println("I can give Assignements");
	}

	void  teach()
	{
		System.out.println("I am a teacher");
	}
}


class PTeacher extends Teacher
{

	void teach()
	{
		super.teach();
		System.out.println("I am a teacher and i can teach physics");
	}
		
}

class DowncastByTypecast
{
	public static void main(String[] args)
	{
		System.out.println("Upcasting  using parent class reference");
		Teacher obj=new PTeacher();
		obj.teach();
		obj.giveAssignments();
		
		System.out.println("Downcasting using object class reference");
		Object o=new PTeacher();		
		PTeacher obj1=(PTeacher)o;
		obj1.teach();
		obj1.giveAssignments();
		
		
	}
}
