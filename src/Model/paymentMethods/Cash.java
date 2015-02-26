package Model.paymentMethods;

import Model.Discounts.DiscountCash;



public class Cash extends FinancialPayment {

	public Cash(String money) {
		this.id=2;
		setBalance(money);
		discount = new DiscountCash();
	}

	public Cash() {
		setBalance("0.00");
		discount = new DiscountCash();
	}

}
