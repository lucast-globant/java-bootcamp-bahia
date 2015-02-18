package ShoppingCart.PaymentMethods;

import java.util.List;

import ShoppingCart.Item;
import ShoppingCart.PaymentMethod;

public class Paypal implements PaymentMethod {

	private String emailId;
	private String password;

	public Paypal(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	
	@Override
	public void pay(float amount, List<Item> items, int id) {
		//save the cheapest item
		float cheapest = items.get(0).getPrice();
		for(int i=0; i<items.size(); i++) 
		{ 
			if(items.get(i).getPrice() < cheapest) 
			{ 
				cheapest = items.get(i).getPrice(); 
			} 
		} 
		//calculate amount without cheapest item
		amount = amount - cheapest;
		System.out.println(id +"     "+ amount + "      Paypal.");
	}

}