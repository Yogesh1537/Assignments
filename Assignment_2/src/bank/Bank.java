package bank;

public class Bank {
	    int account_No;
	    String name;
	    String acc_type;
	    static int amount;
	    static int FDTotal;
	    static int CCTotal;
	    static int TotalMoney;

	    public Bank(int account_No,String name, int amount, String acc_type){
	        this.account_No = account_No;
	        this.name = name;
	        this.acc_type = acc_type;
	        this.amount = amount;

	    }

	    public int getAccount_No() {
	        return account_No;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getacc_type() {
	        return acc_type;
	    }

	    public int getmount() {
	        return amount;
	    }

	    public static int getSavingTotal() {
	        return FDTotal;
	    }
	    public static int getCurrentTotal() {
	        return CCTotal;
	    }

	    public static void setSavingTotal(int amount) {
	    	FDTotal =FDTotal+amount;
	    }

	    public static void setCurrentTotal(int amount) {
	        CCTotal = CCTotal +amount;
	    }

	    public static int getTotalMoney(){
	        return TotalMoney;
	    }

	    public void setTotalMoney(){
	        //bankTotal = (getSavingsTotal()+getCurrentTotal()); /////// set as blank for overriding proof
	    }


	}
