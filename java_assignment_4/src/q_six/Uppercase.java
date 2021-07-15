package q_six;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uppercase {
	public static void main(String[] args) {
		
	        List<String> list1 = new ArrayList<>((Arrays.asList("one", "two", "three", "four", "five")));
	     
	        list1.replaceAll(String::toUpperCase);
	        System.out.println(list1);
	    }
}
