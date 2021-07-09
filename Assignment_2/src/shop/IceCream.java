package shop;

public class IceCream {
	float quantity ;
	float cost;
	float cost_with_tax;


	public IceCream(float q) {
		quantity = q;
	}


	public float getcost() {
		float	cost=quantity*30f;
		float cost_with_tax =(float) (1.20*cost);
		return cost_with_tax;
		
	}
}
