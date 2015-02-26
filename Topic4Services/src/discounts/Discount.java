package discounts;

import items.Item;

import java.util.List;

/* Interface to represent a general Discount*/

public interface Discount {

	public float applyDiscount(List<Item> items, float total);
}
