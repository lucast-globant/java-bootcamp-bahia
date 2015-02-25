package Topic_4.ShoppingCart.PaymentMethod;

import Topic_4.ShoppingCart.Discounts.DiscountCash;

public class Cash extends PaymentMethod {

	public Cash() {
		discount = new DiscountCash();
	}

	public String toString() {
		String s = "Payment by cash.";
		return s;
	}

}
