package Discounts;

import java.util.List;

import Items.Item;

public class DiscountCash implements Discount {

	@Override
	public double applyDiscount(List<Item> items, double price) {
		if (items.size() == 0)
			return 0;
		double total = 0;
		double expensive = items.get(0).getPrice();
		for (Item i : items) {
			if (i.getPrice() > expensive)
				expensive = i.getPrice();
			total += i.getPrice();
		}
		return total - expensive * 0.1;
	}

}
