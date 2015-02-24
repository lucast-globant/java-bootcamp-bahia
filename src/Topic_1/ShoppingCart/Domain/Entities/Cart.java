package Topic_1.ShoppingCart.Domain.Entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cart {

	private List<CartItem> items;
	private Amount amount;

	public Cart() {
		items = new ArrayList<CartItem>();
		amount = new Amount(0);
	}

	public void addItem(CartItem item) {
		items.add(item);
	}

	public List<CartItem> getItems() {
		return items;
	}

	public Amount getAmount() {
		return amount;
	}

	public void updateAmount() {
		double newAmount = 0;

		for (CartItem item : items)
			newAmount += item.getPrice();

		amount.setAmount(newAmount);
	}

	@Override public String toString() {
		// Updates total amount calculating all of the items' discounts
		updateAmount();

		String result = "Cart summary\n------------\n";

		// Print the Cart's items
		for (CartItem element : items) {
			result += element.toString();
		}

		// Print a separator
		result += "-------------------------------------------------\n";

		// Print the total amount
		result += amount.toString();

		return result;
	}

	public void addItems(Collection<? extends CartItem> items) {
		this.items.addAll(items);
	}
}
