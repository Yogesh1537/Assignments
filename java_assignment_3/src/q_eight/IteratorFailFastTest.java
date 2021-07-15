package q_eight;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorFailFastTest {
	public static void main(String[] args) {

		List<Integer> list= new ArrayList<>();
		List<Integer> list2= new CopyOnWriteArrayList<>();
		int[] a= {1,2,3,4,5,6};
		 
		for(int e:a) {
			list.add(e);
			list2.add(e);
		}
 
		Iterator<Integer> it = list.iterator();
		Iterator<Integer> it2 = list2.iterator();
		 

		while(it.hasNext()){
			int n = it.next();
			System.out.println(n);
			if(n==3) 
				it.remove();
			
		}
		System.out.println(list);
		 

		while(it2.hasNext()){
			int n = it2.next();
			System.out.println(n);
			if(n==3) 
				list2.remove(n);
		}
		System.out.println(list2);
		

		Map<String,String> map1= new HashMap<>();
		Map<String,String> map2= new ConcurrentHashMap<>();
		
		map1.put("Ford","Mustang");
		map2.put("Ford","Mustang");
		map1.put("Honda","Amaze");
		map2.put("Honda","Amaze");
		map1.put("Hyundai","Verna");
		map2.put("Hyundai","Verna");
		
		Set<String> keyset = map1.keySet();
		Set<String> keyset2 = map2.keySet();
		
		Iterator<String> iterator = keyset.iterator();
		Iterator<String> iterator2 = keyset2.iterator();
		


		while(iterator.hasNext()){
			
			String Vehicle = iterator.next();
			System.out.println(Vehicle+"\t"+map1.get(Vehicle));
		}

		while(iterator2.hasNext()){
			map1.put("Toyota","Fortuner");
			String Honda = iterator2.next();
			System.out.println(Honda+"\t"+map1.get(Honda));
		}
		
		
	}

}

