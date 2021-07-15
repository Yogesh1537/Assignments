package q_five;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class First_letter {
	public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<>();
        list1.add("Define");
        list1.add("Raw");
        list1.add("Fanatical");
        list1.add("Car");
        list1.add("Weapons");
        list1.add("Snipers");
        list1.add("River");
        list1.add("Peak");
        list1.add("Mountains");
        Consumer<List<String>> firstLetter = a -> {
            StringBuilder s = new StringBuilder();

            a.forEach(firs -> s.append(firs.charAt(0)));
            System.out.println(s);
        };
        firstLetter.accept(list1);
    }
}
