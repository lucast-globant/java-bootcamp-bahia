import java.util.List;



/* A concrete discount ; 90% of the most expensive item is free */

public class NinetyPercentMostExpensiveDiscount implements Discount {

	@Override
	public float applyDiscount(List<Item> items, float total) {

		Item most = mostExpensive(items);

		return total - (most.getPrice() * 90 / 100);

	}

	private Item mostExpensive(List<Item> items) {
		Item mostItem = items.get(0);
		float mostPrice = items.get(0).getPrice();

		for (Item i : items) {

			float price = i.getPrice();

			if (price > mostPrice) {
				mostPrice = price;
				mostItem = i;
			}

		}

		return mostItem;
	}

}
