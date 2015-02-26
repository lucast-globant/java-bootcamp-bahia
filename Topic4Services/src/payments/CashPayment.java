package payments;

import discounts.Discount;
import discounts.NinetyPercentMostExpensiveDiscount;

public class CashPayment implements Payment {

	private Discount discount;

	public CashPayment() {
		discount = new NinetyPercentMostExpensiveDiscount();
	}

	@Override
	public void pay(float total) {

	}

	@Override
	public Discount getDiscount() {
		return discount;
	}

}
