package org;


public class Labour extends Employee {
    public Labour(String name,int Salary, int overtime) {
        super(name,Salary, overtime);
    }

    int overtime = super.getother();

    @Override   
    public int getother() {
        return overtime;
    }
}
	    
	    
	

