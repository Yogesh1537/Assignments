package q_seven;

import java.util.HashMap;

public class Pair {

	public static void main(String[] args) {
		  HashMap<Integer, Integer> idSal = new HashMap<>();
	        idSal.put(01, 50000);
	        idSal.put(02, 83000);
	        idSal.put(03, 12000);
	        idSal.put(04, 75000);
	        idSal.put(05, 30000);
	        idSal.put(06, 15000);

	        StringBuilder s = new StringBuilder();
	        idSal.forEach((m, n) -> s.append(m.toString()).append(n.toString()));
	        System.out.println(s);
	      
	        idSal.forEach((m, n) -> System.out.print(m.toString() + n.toString()));
	}

}
