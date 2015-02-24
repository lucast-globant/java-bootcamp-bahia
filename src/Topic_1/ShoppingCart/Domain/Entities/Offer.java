package Topic_1.ShoppingCart.Domain.Entities;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents an offer made over some items
 */
public class Offer extends CartItem {
	private Collection<CartItem> cartItems;

	public Offer(String name, double price) {
		super(name, price);
		cartItems = new ArrayList<CartItem>();
	}

	public Collection<CartItem> getCartItems() {
		return cartItems;
	}

	public void addItem(CartItem cartItem) {
		cartItems.add(cartItem);
	}

	@Override public String toString() {
		String discountDescription = hasDiscount() ? getDiscount().getDescription() : "";

		String result = String.format("Offer %-26s $ %10.2f\t%s\n", name, getPrice(), discountDescription);

		for (CartItem cartItem : cartItems)
			result += "\t" + cartItem.toString();

		return result;
	}
}
