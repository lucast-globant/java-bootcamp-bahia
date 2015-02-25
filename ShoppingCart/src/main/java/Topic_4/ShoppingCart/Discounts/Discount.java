package Topic_4.ShoppingCart.Discounts;

import java.util.List;

import Topic_4.ShoppingCart.Items.Item;

public interface Discount {

	public float applyDiscount(List<Item> items, float price);

}
