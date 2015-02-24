package Topic_1.ShoppingCart.Domain.Entities;

/**
 * Represents an item of the business
 */
public class Item extends CartItem {

	public Item(String name, double price) {
		super(name, price);
	}

	@Override public String toString() {
		String discountDescription = hasDiscount() ? getDiscount().getDescription() : "";

		return String.format("Item  %-26s $ %10.2f\t%s\n", name, getPrice(), discountDescription);
	}

}
