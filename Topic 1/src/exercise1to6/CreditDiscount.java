package exercise1to6;

import java.util.List;

public class CreditDiscount implements Discount {

	@Override
	public double makeDiscount(List<Product> items) {
		double total = 0;
		for (Product product : items) {
			total = total + product.getPrice();
		}
		return total * 0.1;

	}

}
