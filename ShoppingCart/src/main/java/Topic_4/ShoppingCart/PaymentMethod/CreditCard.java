package Topic_4.ShoppingCart.PaymentMethod;

import Topic_4.ShoppingCart.Discounts.DiscountCC;

public class CreditCard extends PaymentMethod {
	protected int number;
	protected String name;

	public CreditCard(int number, String name) {
		this.number = number;
		this.name = name;
		discount = new DiscountCC();
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

	public String toString() {
		String s = "Payment by credit card.";
		return s;
	}

}
