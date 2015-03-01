package PaymentMethod;

import ShopingCart.Cart;

public class Cash implements PaymentMethod {

	public Cash() {

	}

	public float applyDiscount(Cart cart) {
		if (cart.getMostExpensiveItem() == null)
			return cart.getSubtotal();
		else
			return cart.getSubtotal() - cart.getMostExpensiveItem().getPrice() * 0.9f;
	}

	public String toString() {
		String s = "Payment by cash.";
		return s;
	}

}
