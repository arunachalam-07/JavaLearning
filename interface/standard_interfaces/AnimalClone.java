
class Animal implements Cloneable{
    String name;
    String color;
    void walk()
    {
        System.out.println(this.name+" I am walking");
    }
    
    void eat()
    {
        System.out.println(this.name+" I am eating");
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return (Animal)super.clone();
    }
    
}

public class AnimalClone
{
	public static void main(String[] args) {
		//java.util.ArrayList<Integer> l= new java.util.ArrayList<Integer>();
		Animal a= new Animal();
		a.name="puma messi";
		a.color="caramel";
		System.out.println(a);
		try
		{
		    Animal a1=(Animal)a.clone();
		    System.out.println(a1);
		    System.out.println(a1.name);
		    System.out.println(a1.color);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}

