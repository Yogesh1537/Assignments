package shop;

public class Cookie extends DessertItem {
	float quantity ;
	float cost;
	float tax;

	public Cookie(float q) {
		
	}
	public float getcost() {
		float cost=quantity*3f*70;
		float tax= (cost*20)/100;
		float cost_with_tax =cost+tax;
		return cost_with_tax;
		
	}
}
