package shop;

public class Candy extends DessertItem {
	float quantity ;
float cost;
float  cost_with_tax;





public Candy(float q) {
	quantity = q;
}


public float getcost() {
float	cost=quantity*2f*60;
float cost_with_tax =(float) (1.20*cost);
return cost_with_tax;
	
}
}
