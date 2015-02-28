package PaymentMethod;

import ShopingCart.Cart;

public class Cash implements PaymentMethod {

	public Cash() {
		
	}
	
	public float applyDiscount(Cart cart) {
		return cart.getSubtotal() - cart.getMostExpensiveItem().getPrice() * 0.9f;
	}
	
	public String toString() {
		String s = "Payment by cash.";
		return s;
	}

	
}
