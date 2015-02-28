package PaymentMethod;

import ShopingCart.Cart;

public class Paypal implements PaymentMethod {
	protected String email, pass;

	public Paypal(String email, String pass) {
		this.email = email;
		this.pass = pass;
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
	
	@Override
	public float applyDiscount(Cart cart) {
		return cart.getSubtotal() - cart.getCheapestItem().getPrice();
	}
	
	public String toString() {
		String s = "Payment by Paypal.";
		return s;
	}

	

}
