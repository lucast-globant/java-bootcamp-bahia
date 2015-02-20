package exercise1to6.payments;

import exercise1to6.discount.CreditDiscount;

public class CreditCard extends PaymentType {

	private double creditNumber;
	private String name;

	public CreditCard( double creditNumber, String name) {
		super(new CreditDiscount() );
		this.creditNumber = creditNumber;
		this.name = name;
	}

	@Override
	public void pay(double total) {
		System.out.println("Payment Made by: CREDIT CARD \n");


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
