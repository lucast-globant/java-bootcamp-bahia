package shoppingCart;

import java.util.ArrayList;
import java.util.List;

// An offer is a special kind of product that has a list of items
public class Offer extends Product {
	private List<Item> components;

	public Offer(String name, float price) {
		super(name, price, true);
		components = new ArrayList<>();
	}

	public void addItem(Item item) {
		components.add(item);
	}

	public void addItem(Product product, float quantity) {
		components.add(new Item(product, quantity));
	}

	@Override
	public String toString() {
		String output = "------------------------------\n" + "*" + super.getName() + "... $"
				+ String.format("%.2f", super.getPrice()) + "\n";
		int size = components.size();
		for (int i = 0; i < size; i++)
			output = output.concat(components.get(i).toString());
		return output.concat("------------------------------\n");
	}
}
