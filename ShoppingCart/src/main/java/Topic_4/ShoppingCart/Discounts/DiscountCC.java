package Topic_4.ShoppingCart.Discounts;

import java.util.List;

import Topic_4.ShoppingCart.Items.Item;

public class DiscountCC implements Discount {

	public float applyDiscount(List<Item> items, float price) {
		float p = price * 0.9f;
		return p;
	}

}
