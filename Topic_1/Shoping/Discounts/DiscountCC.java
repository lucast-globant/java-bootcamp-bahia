package Discounts;

import java.util.List;

import Items.Item;

public class DiscountCC implements Discount {

	@Override
	public double applyDiscount(List<Item> items, double price) {
		double p = price * 0.9;
		return p;
	}

}
