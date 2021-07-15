package q_nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BankAccountList {
	public static void main(String[] args) {


        List<SavingAccount> sa = new ArrayList<>();

        sa.add(new SavingAccount(101248, 50000, "Tushar", false));
        sa.add(new SavingAccount(104578, 48300, "Vinay",false ));
        sa.add(new SavingAccount(114583, 15000, "Yash", true));
        sa.add(new SavingAccount(159827, 270000, "Aashish", false));
        sa.add(new SavingAccount(178349, 95000, "Saurabh", true));
        Collections.sort(sa);
        
        for (int i = 0; i < sa.size(); i++) {
       System.out.println("The details are " + sa.get(i));
   }


    }

}
