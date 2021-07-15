package q_two;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hash {
public static void main (String[] args) {
	  Set<Integer> s1 = new HashSet<>();
	  s1.add(32);
	  s1.add(2);
	  s1.add(54);
	  s1.add(21);
	  s1.add(65);

    System.out.println(s1);
	
    Set<Integer> s2 = new LinkedHashSet<>();
    s2.add(32);
	  s2.add(2);
	  s2.add(54);
	  s2.add(21);
	  s2.add(65);
    
	    System.out.println(s2);

    
    
}
}
