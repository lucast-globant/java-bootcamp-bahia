package exercise1to6.discount;

import java.util.List;

import exercise1to6.cart.Item;
import exercise1to6.cart.Product;

public class PaypalDiscount implements Discount {

	@Override
	public double makeDiscount(List<Item> items) {
		Item cheapest = items.get(0); // first element
		for (Item product : items) {
			if (cheapest.getPrice() > product.getPrice())
				cheapest = product;
		}
		return cheapest.getPrice();

	}

}


