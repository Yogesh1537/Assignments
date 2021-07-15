package q_seven;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


//import com.sun.tools.javac.util.List;

public class Parked_CarOwnerList_Details {
static int i = 1;
	
	
	Scanner ip = new Scanner(System.in);
	
	//Set<Parked_CarOwner_details> p1 = new HashSet<>();
	List<Parked_CarOwner_details> p1 = new ArrayList<>();
	
	public void add_new_car(List <Parked_CarOwner_details> pcodAdd)
	{
		if (pcodAdd.isEmpty()) {
		pcodAdd.add(new Parked_CarOwner_details());
		}else {
			pcodAdd.add(i, new Parked_CarOwner_details());
		}
	}
	public void remove_car(List<Parked_CarOwner_details> pcod1, int a) 
	{
		pcod1.remove(a-1);
	}
	public void getParkedCarLocation(int a) {
		
		if (a <= 80) 
		{
			System.out.println("Car is parked on the first floor");
		} else if (a > 80 && a <= 160) 
		{
			System.out.println("Car is parked on the second floor");
		}else if (a > 160 && a <= 240) 
		{
			System.out.println("Car is parked on the third floor");
		}else if ((a > 240 && a <= 320)) 
		{
			System.out.println("Car is parked on the fourth floor");
		}else {
				System.out.println("Please enter a Valid token number");
			
		}
		
	}
	
	

}


