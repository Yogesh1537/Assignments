package q_two;
import java.util.ArrayList;  
import java.util.List;

public class Product{  
    int id;  
    String name;  
    int price;
    String status;
    public Product(int id, String name, int price,String status) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;
        this.status = status;
   }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", status=" + status + "]";
	}
}    
    

class Lambda{  
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<>();  
        list.add(new Product(1,"Samsung A5",17000,"Rejected"));  
        list.add(new Product(3,"Iphone 6S",65000,"Accepted"));  
        list.add(new Product(2,"Sony Xperia",25000,"Accepted"));  
        list.add(new Product(4,"Nokia Lumia",15000,"Rejected"));  
        list.add(new Product(5,"Redmi4 ",6000,"Accepted"));  
        list.add(new Product(6,"Lenevo Vibe",19000,"Rejected"));  
        
        

        PriceMoreThan10 checkPrice = (a) -> {
            if (a.price > 10000 && a.status.equals("Accepted")) 
                return true;
            else
                return false;
        };

        for (Product a : list) {
           if (checkPrice.priceMoreThan10(a)) System.out.println(a);
        }

        
        
        
    }

}

@FunctionalInterface
interface PriceMoreThan10 {
    boolean priceMoreThan10(Product a);
}