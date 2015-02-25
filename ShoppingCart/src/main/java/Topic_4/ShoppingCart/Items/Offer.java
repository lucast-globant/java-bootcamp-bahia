package Topic_4.ShoppingCart.Items;

import java.util.List;

public class Offer implements Item {
	protected String name;
	protected float price;
	protected List<Item> items;

	public Offer(String name, float price, List<Item> items) {
		this.name = name;
		this.price = price;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		String s = "";
		s += name + " ....... $" + price + "\n";
		for (Item i : items) {
			s += "\t" + i.toString();
		}
		return s;
	}

}
