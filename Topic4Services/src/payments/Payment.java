package payments;

import discounts.Discount;

public interface Payment {

	void pay(float total);

	Discount getDiscount();

}
