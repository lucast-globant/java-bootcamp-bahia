package exercise1to6.payments;

import exercise1to6.discount.CashDiscount;
import exercise1to6.discount.Discount;

public class Cash extends PaymentType {

	public Cash(Discount discount) {
		super(new CashDiscount() );



	}

	@Override
	public void pay(double total) {
		System.out.println("Payment Made by: CASH \n");
		
	}

}
