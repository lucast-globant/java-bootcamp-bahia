package ex2.Payments;

import ex2.Discount.*;


public class Cash extends PaymentType {

	public Cash() {
		super(new CashDiscount() );



	}

	@Override
	public void pay(double total) {
		System.out.println("Payment Made by: CASH \n");
		
	}

}
