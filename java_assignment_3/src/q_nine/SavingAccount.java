package q_nine;


import java.util.Scanner;
;

public class SavingAccount implements Comparable<SavingAccount> {

    Scanner ip = new Scanner(System.in);
    int acc_no;
    int acc_balance;
    String accountHolderName;
    boolean isSalaryAccount;

    public SavingAccount(int acc_no ,int acc_balance, String accountHolderName, boolean isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_no = acc_no;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }
    public void withdraw(){
        System.out.println("Please Enter the amount to be withdrawn");
        int withdraw = ip.nextInt();

        this.acc_balance -= withdraw;

    }
    public void deposit(){
        System.out.println("Please Enter the amount that you want to deposit");
        int doposit = ip.nextInt();

        this.acc_balance += acc_balance;
    }
    
    
    
    public double getAcc_balance() {
        return acc_balance;
    }

    public double getAcc_no() {
        return acc_no;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setAcc_balance(int acc_balance) {
        this.acc_balance = acc_balance;
    }

    public void setacc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setSalaryAccount(boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }
    @Override
    public String toString() {
        return "SavingAccount{" +
                "acc_no=" + acc_no +
                ", acc_balance=" + acc_balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", isSalaryAccount=" + isSalaryAccount +
                '}';
    }
    @Override
    public int compareTo(SavingAccount o) {
        if(this.getAcc_no() > o.getAcc_no()){
            return 1;
        }else if(this.getAcc_no() < o.getAcc_no()){
            return -1;
        }else{
            return 0;
        }
    }
}




