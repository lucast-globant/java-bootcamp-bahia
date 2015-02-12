package PaymentMethod;

import Discounts.DiscountPaypal;

public class Paypal extends PaymentMethod {
	protected String email, pass;

	public Paypal(String e, String p) {
		email = e;
		pass = p;
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
		String s = "Payment by Paypal. \n";
		s += "Email: " + email;
		return s;
	}

}
