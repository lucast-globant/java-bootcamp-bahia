package Topic_4.ShoppingCart.PaymentMethod;

import java.util.List;

import Topic_4.ShoppingCart.Discounts.Discount;
import Topic_4.ShoppingCart.Items.Item;

public abstract class PaymentMethod {
	protected Discount discount;

	public float applyDiscount(List<Item> items, float price) {
		return discount.applyDiscount(items, price);
	}

}
