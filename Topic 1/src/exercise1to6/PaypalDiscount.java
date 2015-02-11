package exercise1to6;

import java.util.List;

public class PaypalDiscount implements Discount {

	@Override
	public double makeDiscount(List<Product> items) {
		Product cheapest = items.get(0); // first element
		for (Product product : items) {
			if (cheapest.getPrice() > product.getPrice())
				cheapest = product;
		}
		return cheapest.getPrice();

	}

}
