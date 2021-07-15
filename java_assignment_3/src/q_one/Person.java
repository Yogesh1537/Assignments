package q_one;

import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
	Integer weight;
    Integer height;
    String name;
	
 public Person(String name,Integer weight,Integer height)
    {
	  super();
      this.name=name;
      this.weight=weight;
      this.height=height;
    }
 
 public String getName() {
		return name;
	}
 
public Integer getWeight() {
	return weight;
}

public Integer getHeight() {
	return height;
}

	
    @Override
public String toString() 
    {
	return "Person [Name = "+name+ ",Weight=" + weight + ", Height=" + height + "]";
    }
    
    public int compareTo(Person o)
    {
    if (this.getWeight()==o.getWeight()) 
    	{
    	return this.getHeight().compareTo(o.getHeight());
    	}
    	else
    		{
    		return this.getWeight().compareTo(o.getWeight());
    		}
    	
    }
    	public static void main(String[] args)
    		    {
    		      Set<Person> s = new TreeSet<>();

    		      s.add(new Person("Anuj"  , 54,158));
    		      s.add(new Person("Ramesh"  ,63,175));
    		      s.add(new Person("Shivam" , 68,173));
    		      s.add(new Person("Rohit"  , 68,180));
    		      System.out.println(s);
    		      
    		    }
    		
}
    		
    		
    		
    		
    		


