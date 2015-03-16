package cartServices;

import java.util.ArrayList;
import java.util.List;

import repositoryServices.Item;

/* Represent a  shopping cart , contains a list of items that the costumer its buying */

public class Cart {

	List<Item> items;
	int totalPrice;

	public Cart() {
		items = new ArrayList<Item>();

	}

	public void addItem(Item i) {

		this.items.add(i);

	}

	public void addItems(List<Item> items) {
		this.items.addAll(items);
	}

	public void removeItem(Item i) {

		this.removeItem(i);
	}

	public float totalPrice() {

		float sum = 0;

		for (Item i : this.items)

			sum += i.getPrice();

		return sum;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public String toString() {
		String resu = "";
		for (Item item : items) {
			resu += item.toString() + '\n';
		}
		return resu;
	}

}
