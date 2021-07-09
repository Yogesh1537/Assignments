package bank;

public class main {
	
		
	    public static void main(String[] args) {

	        Saving Ankush = new Saving(106436,"Ankush",500000,"Saving");
	        Current Tushar = new Current(100457,"Tushar",250000,"Current");

	        System.out.println("Total amount as a Fixed deposit in Savings is "+Bank.getSavingTotal());
	        System.out.println("Total amount as a cash credit in current is "+Bank.getCurrentTotal());
	        //System.out.println("Total amount in bank is "+ (bank.getCurrentTotal()+ bank.getSavingsTotal()));

	        System.out.println("Total Amount in Bank: "+Bank.getTotalMoney());
	    }
	}



