package exercise1to6;

import java.util.List;

public class CashDiscount implements Discount {

	@Override
	public double makeDiscount(List<Product> items) {
		Product expensive = items.get(0); // first element
		for (Product product : items) {
			if (expensive.getPrice() < product.getPrice())
				expensive = product;
		}
		return expensive.getPrice() * 0.9;

	}

}
