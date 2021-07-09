package singleton;

public class main {
	 public static void main(String[] args) {
	        Singleton one = Singleton.getInstance();
	        Singleton two = Singleton.getInstance();

	        System.out.println(one);
	        System.out.println(two);
	    }
}
