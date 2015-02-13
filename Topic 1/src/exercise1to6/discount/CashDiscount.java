package exercise1to6.discount;

import java.util.List;

import exercise1to6.cart.Item;
import exercise1to6.cart.Product;

public class CashDiscount implements Discount {

	@Override
	public double makeDiscount(List<Item> items) {
		Item expensive = items.get(0); // first element
		for (Item product : items) {
			if (expensive.getPrice() < product.getPrice())
				expensive = product;
		}
		return expensive.getPrice() * 0.9;

	}



}
