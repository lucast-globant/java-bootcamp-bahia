package ex2.Discount;

import java.util.List;

import ex2.ShoppingCart.*;


public class CreditDiscount implements Discount {

	public double makeDiscount(List<Item> items) {
		double total = 0;
		for (Item product : items) {
			total = total + product.getPrice();
		}
		return total * 0.1;

	}

}
