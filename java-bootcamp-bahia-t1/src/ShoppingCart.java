import java.util.ArrayList;
import java.util.List;

/* Represent a  shopping cart , contains a list of items that the costumer its buying */

public class ShoppingCart {

	List<Item> items;
	int totalPrice;

	public ShoppingCart() {
		items = new ArrayList<Item>();

	}

	public void addItem(Item i) {

		this.items.add(i);

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
