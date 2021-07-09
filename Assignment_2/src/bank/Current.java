package bank;

	public class Current extends Bank{
	    public Current(int account_No, String name, int amount, String acc_type) {
	        super(account_No, name, amount, acc_type);
	        if((this.acc_type).equals("Current")) {
	            Bank.setCurrentTotal(amount);
	            setTotalMoney();
	        }
	    }

	    @Override
	    public void setTotalMoney() {
	        TotalMoney = (getCurrentTotal()+getSavingTotal());

	    }
	}

