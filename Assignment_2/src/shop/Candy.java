package shop;

public class Candy extends DessertItem {
	float quantity ;
float cost;
float  cost_with_tax;





public Candy(float q) {
	// TODO Auto-generated constructor stub
}


public float getcost() {
float	cost=quantity*2f*60;
float tax= (cost*20)/100;
float cost_with_tax =cost+tax;
return cost_with_tax;
	
}
}