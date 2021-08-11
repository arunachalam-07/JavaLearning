import java.lang.*;
import java.util.*;

class Comparasion implements Comparable<Comparasion>
{
	String str;
Comparasion(String str)
{
	this.str=str;
}

public String get()
{
	return (str);
}

public int compareTo(Comparasion com)
{
	int status=0;
	if((this.str).compareTo(com.str)>0)status=1;

	if((this.str).compareTo(com.str)<0)status=-1;

	if((this.str).compareTo(com.str)==0)status=0;
	return status;
}

}

class Collections_Comparasion
{
	public static void main(String[] args)
	{
		ArrayList<Comparasion> obj=new ArrayList<Comparasion>();
		obj.add(new Comparasion("muthu"));
		obj.add(new Comparasion("puppy"));
		obj.add(new Comparasion("arul"));
		obj.add(new Comparasion("puma"));
		obj.add(new Comparasion("alexander"));
		obj.add(new Comparasion("maria"));
		obj.add(new Comparasion("prince michael"));

		System.out.println("before sorting");
		for(Comparasion dobj:obj)
		{
			System.out.println(dobj.get());
		}
		System.out.println("After sorting");

		Collections.sort(obj);
		for(Comparasion dobj:obj)
		{
			System.out.println(dobj.get());
		}
	}
}
