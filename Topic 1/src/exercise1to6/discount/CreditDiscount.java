package exercise1to6.discount;

import java.util.List;

import exercise1to6.cart.Item;
import exercise1to6.cart.Product;

public class CreditDiscount implements Discount {

	public double makeDiscount(List<Item> items) {
		double total = 0;
		for (Item product : items) {
			total = total + product.getPrice();
		}
		return total * 0.1;

	}

}
