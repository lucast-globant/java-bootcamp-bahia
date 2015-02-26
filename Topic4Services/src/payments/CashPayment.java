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

		System.out.println("Your purchase in cash for $" + total + " was succed !");
		System.out.println("You have a 90% FREE of the most expensive item for paying in cash");
		System.out.println("Calculating new cost..");
	}

	@Override
	public Discount getDiscount() {
		return discount;
	}

}
