package discounts;

import java.util.List;

import repositoryServices.Item;

/* Interface to represent a general Discount*/

public interface Discount {

	public float applyDiscount(List<Item> items, float total);
}
