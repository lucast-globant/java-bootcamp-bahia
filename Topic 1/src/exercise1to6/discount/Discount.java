package exercise1to6.discount;

import java.util.List;

import exercise1to6.cart.Item;


public interface Discount {

	public double makeDiscount(List<Item> items);

}
