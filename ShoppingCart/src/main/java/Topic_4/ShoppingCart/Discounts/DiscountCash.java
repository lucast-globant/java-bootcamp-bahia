package Topic_4.ShoppingCart.Discounts;

import java.util.List;

import Topic_4.ShoppingCart.Items.Item;

public class DiscountCash implements Discount {

	public float applyDiscount(List<Item> items, float price) {
		if (items.size() == 0)
			return 0;
		float total = 0;
		float expensive = items.get(0).getPrice();
		for (Item i : items) {
			if (i.getPrice() > expensive)
				expensive = i.getPrice();
			total += i.getPrice();
		}
		return total - expensive * 0.9f;
	}

}
