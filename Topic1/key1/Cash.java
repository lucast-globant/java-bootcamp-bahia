package Topic1.key1;

import Topic1.key2.DiscountCash;

public class Cash extends FinancialPayment {

	public Cash(String money) {
		setBalance(money);
		discount = new DiscountCash();
	}

}
