package ShoppingCart.PaymentMethods;

import java.util.List;

import ShoppingCart.Item;
import ShoppingCart.PaymentMethod;


public class Cash implements PaymentMethod{
	@Override
	public void pay(float amount, List<Item> items, int id) {
		float expensive = items.get(0).getPrice();
		for(int i=0; i<items.size(); i++) 
		{ 
			if(items.get(i).getPrice() > expensive) 
			{ 
				expensive = items.get(i).getPrice(); 
			} 
		} 
		//calculate 90% of the expensive item
		expensive = (float) (expensive*0.9);
		//calculate amount
		amount = amount - expensive;
		System.out.println(id +"     "+ amount + "       Cash");
	}
}
