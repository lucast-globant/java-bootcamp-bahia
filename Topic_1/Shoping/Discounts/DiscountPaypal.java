package Discounts;

import java.util.List;

import Items.Item;

public class DiscountPaypal implements Discount {

	@Override
	public double applyDiscount(List<Item> items, double price) {
		if (items.size() == 0)
			return 0;
		double total = 0;
		double cheapest = items.get(0).getPrice();
		for (Item i : items) {
			if (i.getPrice() < cheapest)
				cheapest = i.getPrice();
			total += i.getPrice();
		}
		return total - cheapest;
	}

}
