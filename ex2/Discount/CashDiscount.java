package ex2.Discount;

import java.util.List;

import ex2.ShoppingCart.*;


public class CashDiscount implements Discount {

	@Override
	public double makeDiscount(List<Item> items) {
		if (!items.isEmpty()) {
			Item expensive = items.get(0); // first element
			for (Item product : items) {
				if (expensive.getPrice() < product.getPrice())
					expensive = product;
			}
			return expensive.getPrice() * 0.9;
		} else
			return 0;

	}

}
