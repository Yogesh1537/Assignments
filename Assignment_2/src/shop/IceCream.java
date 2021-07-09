package shop;

public class IceCream {
	float quantity ;
	float cost;
	float cost_with_tax;


	public IceCream(float q) {
		// TODO Auto-generated constructor stub
	}


	public float getcost() {
		float	cost=quantity*30f;
		float tax= (cost*20)/100;
		float cost_with_tax =cost+tax;
		return cost_with_tax;
		
	}
}
