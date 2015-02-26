package discounts;

import items.Item;

import java.util.List;

/* A concrete discount ; the cheapest item its for free */

public class CheapestItemFreeDiscount implements Discount {

	@Override
	public float applyDiscount(List<Item> items, float total) {
		Item cheapest = lessExpensive(items);
		return total - cheapest.getPrice();

	}

	private Item lessExpensive(List<Item> items) {
		Item lessItem = items.get(0);
		float lessPrice = items.get(0).getPrice();

		for (Item i : items) {

			float price = i.getPrice();

			if (price < lessPrice) {
				lessPrice = price;
				lessItem = i;
			}

		}

		return lessItem;
	}

}
