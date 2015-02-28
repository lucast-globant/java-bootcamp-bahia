package ex2.Discount;

import java.util.List;

import ex2.ShoppingCart.*;


public class PaypalDiscount implements Discount {

	@Override
	public double makeDiscount(List<Item> items) {
		if (!items.isEmpty()) {
			Item cheapest = items.get(0); // first element
			for (Item product : items) {
				if (cheapest.getPrice() > product.getPrice())
					cheapest = product;
			}
			return cheapest.getPrice();
		}
		else
			return 0;

	}

}
