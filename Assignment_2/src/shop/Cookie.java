package shop;

public class Cookie extends DessertItem {
	float quantity ;
	float cost;
	float tax;

	public Cookie(float q) {
		quantity = q;
	}
	public float getcost() {
		float cost=quantity*3f*70;
		float cost_with_tax =(float) (1.20*cost);
		return cost_with_tax;
		
	}
}
