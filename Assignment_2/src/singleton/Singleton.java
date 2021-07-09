package singleton;

public class Singleton {
	private static Singleton one;

	private Singleton() {
    }

    static Singleton instance =one ;  

    public static Singleton getInstance(){      
        Singleton one;
		if(instance == one)          
        {
           instance = new Singleton();  
        }
        return instance;
    }
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
