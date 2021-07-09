package org;

 
public class Manager extends Employee {

    public Manager(String name,  int Salary, int incentive) {
        super(name,Salary, incentive);
    }

    int incentive = super.getother();

    @Override    
    public int getother() {
        return incentive;
    }
}



