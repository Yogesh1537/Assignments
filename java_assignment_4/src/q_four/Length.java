package q_four;
import java.util.ArrayList;
public class Length {

	public static void main(String[] args) {
		
		 ArrayList<String> words = new ArrayList<String>();
		  	       
	        words.add("Ram");
	        words.add("Mohan");
	        words.add("Sohan");
	        words.add("Tina");
	        words.add("Shivam");
	        

	         
	        System.out.println(words);
	        words.removeIf((String n) -> n.length() %2 != 0 );
	            for (String s: words) {
	                System.out.println(s);
	            }
	        }	        
	        
}


