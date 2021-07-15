package q_seven;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parking_runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tkn;
		List<Parked_CarOwner_details> pcod1 = new ArrayList<Parked_CarOwner_details>();
		

		Parked_CarOwnerList_Details pcol1 = new Parked_CarOwnerList_Details();
		Parked_CarOwnerList_Details pcol2 = new Parked_CarOwnerList_Details();
		Parked_CarOwnerList_Details pcol3 = new Parked_CarOwnerList_Details();
		
		pcol1.add_new_car(pcod1);
		pcol2.add_new_car(pcod1);
		pcol3.add_new_car(pcod1);

		
		
		printAll(pcod1);
		
		  		  
		  System.out.println("");
		  System.out.println("Enter the token number");
		  tkn = sc.nextInt();
		// provide the parking floor	
					pcol2.getParkedCarLocation(tkn);
					System.out.println("Before Deletion");
					printAll(pcod1); 
		// remove the element  
					System.out.println("");
		  pcol2.remove_car(pcod1, tkn);
		  System.out.println("After Deletion");
		  printAll(pcod1);

	}

	private static void printAll(List<Parked_CarOwner_details> pcod1) {
		// TODO Auto-generated method stub
		for (Parked_CarOwner_details pp : pcod1) {
			System.out.println(pp);
		}

	}



}
