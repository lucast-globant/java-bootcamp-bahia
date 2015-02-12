package Discounts;

import java.util.List;

import Items.Item;

public interface Discount {

	public double applyDiscount(List<Item> items, double price);

}
