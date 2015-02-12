package exercise1to6.payments;

import exercise1to6.discount.Discount;

public class Cash extends PaymentType {

	public Cash(Discount discount) {
		super(discount);
	}

	@Override
	public void pay(double total) {
		// make payment with Person
		
	}

}
