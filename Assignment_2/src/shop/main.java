package shop;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("\\nPlease select your role \n 1. Customer \n 2.  Owner");
int r = sc.nextInt();
if(r==1)
{
	System.out.println("Enter the item you want to buy \n 1. Candy \n 2. Cookie \n 3. IceCream");
	int item = sc.nextInt();
	System.out.println("Enter the quantity");
	int q = sc.nextInt();
	switch(item)
	{
	  case 1:
	  	Candy c = new Candy (q);
	  	System.out.println("Your bill is:"+c.getcost());
	    break;
	  case 2:
		  Cookie ck = new Cookie (q);
		  System.out.println("Your bill is:"+ck.getcost());
	    break;
	  case 3:
		 IceCream I = new IceCream (q);
		 System.out.println("Your bill is:"+I.getcost());
	    break;
	  default:
	    System.out.println("\nNot Found");
	}

	
}
if(r==2) {
	System.out.println("Enter the item you want to add \n 1. Candy \n 2. Cookie \n 3. IceCream");
	int item = sc.nextInt();
	System.out.println("Enter the quantity");
	int q = sc.nextInt();
	System.out.println("You added " +q+ " item successfully");
}
}
}
