package q_one;

public class Lambda {
	public static void main(String[] args) {
		
	
	Arithmetic addition  =(int a,int b) -> 	(a+b);
	
	System.out.println("addition is "+addition.operation(80,20));
	
    Arithmetic substraction  =(int a,int b) -> 	(a-b);
	
	System.out.println("Substraction is "+substraction.operation(80,20));
	
    Arithmetic multiplication  =(int a,int b) -> 	(a*b);
	
	System.out.println("multiplication is "+multiplication.operation(80,20));
	
    Arithmetic division  =(int a,int b) -> 	(a/b);
	
	System.out.println("division is "+division.operation(80,20));
	
		
	}
		interface Arithmetic
		{
		int operation(int a,int b);
	    }
}	
	
	
	
	
	
	
	

