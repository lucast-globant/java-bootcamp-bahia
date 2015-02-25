package Topic_4.ShoppingCart.PaymentMethod;

import Topic_4.ShoppingCart.Discounts.DiscountPaypal;

public class Paypal extends PaymentMethod {
	protected String email, pass;

	public Paypal(String email, String pass) {
		this.email = email;
		this.pass = pass;
		discount = new DiscountPaypal();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String toString() {
		String s = "Payment by Paypal.";
		return s;
	}

}
