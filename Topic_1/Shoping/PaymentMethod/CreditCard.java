package PaymentMethod;

import Discounts.DiscountCC;

public class CreditCard extends PaymentMethod {
	protected int number;
	protected String name;

	public CreditCard(int nu, String na) {
		number = nu;
		name = na;
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
		String s = "Payment by credit card. \n";
		s += "\tCredit Number: " + number + "\n";
		s += "\tName: " + name;
		return s;
	}

}
