package org;

public class Employee {
	   

	String name;
    int Salary;
    int other;

    
    public Employee(String name,int Salary,int other){
        this.name = name;
        this.Salary = Salary;
        this.other = other;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }

    public int getother() {   
        return other;
    }

}
