package org;

public class Main {
	public class main {
	    public static void main(String[] args) {

	        Manager Rohan = new Manager("Rohan",55000,3500);
	        Labour Manish = new Labour("Manish",12000,1000);


	   

	        System.out.println("Total pay of "+Rohan.getName()+" (Manager) is "+(Rohan.getSalary()+Rohan.getother())
	        +" where salary is "+Rohan.getSalary()+" and incentive is "+ Rohan.getother());

	        System.out.println("Total pay of "+Manish.getName()+" (Labour) is "+(Manish.getSalary()+Manish.getother())
	                +" where salary is "+Manish.getSalary()+" and overtime is  "+ Manish.getother());

	        System.out.println("Total salary of all Employees :"+((Rohan.getSalary()+Rohan.getother())+
	                (Manish.getSalary()+Rohan.getother())));
	    }
	}
}

