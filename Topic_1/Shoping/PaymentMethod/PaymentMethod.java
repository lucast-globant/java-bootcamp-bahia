package PaymentMethod;

import java.util.List;

import Discounts.Discount;
import Items.Item;

public abstract class PaymentMethod {
	protected Discount discount;

	public double applyDiscount(List<Item> items, double price) {
		return discount.applyDiscount(items, price);
	}

}
