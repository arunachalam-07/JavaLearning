class Animal implements Comparable<Animal>
{
    String name;
    String color;
    int weight;
    
    Animal(String name,String color,int weight)
    {
        this.name=name;
        this.color=color;
        this.weight=weight;
    }
    
    @Override
    public int compareTo(Animal o)
    {
        if((this.name).compareTo(o.name)>0)
            {
                return 1;
            }
        else if ((this.name).compareTo(o.name)<0)
        {
            return -1;
        }
        
        else return 0;
    }
}
public class AnimalComparable
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    Animal[] test={new Animal("puma messi","carmel",100),new Animal("gerda","carmel",120),new Animal("kira","pale rose",50)};
    java.util.ArrayList<Animal> ani= new java.util.ArrayList<Animal>();
    ani.add(new Animal("subramani","carmel",50));
    ani.add(new Animal("phil","white",40));
    ani.add(new Animal("juju","carmel",50));
    ani.add(new Animal("micahel","grey",30));
    
    java.util.Collections.sort(ani);
    
    System.out.println("Using collections");
    
    for(Animal e:ani){
        System.out.println(e.name);
    }
    
    
    java.util.Arrays.sort(test);
    System.out.println("Comparable interface using arrays");
    for(Animal ele:test){
        System.out.println(ele.name);
    }
    
	}
}

