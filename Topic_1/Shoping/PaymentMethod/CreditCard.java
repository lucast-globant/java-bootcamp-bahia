package PaymentMethod;

import ShopingCart.Cart;

public class CreditCard implements PaymentMethod {
	protected int number;
	protected String name;

	public CreditCard(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float applyDiscount(Cart cart) {
		return cart.getSubtotal() * 0.9f;
	}
	
	public String toString() {
		String s = "Payment by credit card.";
		return s;
	}

	

}
