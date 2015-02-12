package exercise1to6.payments;

import exercise1to6.discount.Discount;

public class CreditCard extends PaymentType {

	private double creditNumber;
	private String name;

	public CreditCard(Discount discount, double creditNumber, String name) {
		super(discount);
		this.creditNumber = creditNumber;
		this.name = name;
	}

	@Override
	public void pay(double total) {
		// make payment with Paypal

	}

	public double getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(double creditNumber) {
		this.creditNumber = creditNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
