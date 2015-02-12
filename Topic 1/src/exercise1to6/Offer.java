package exercise1to6;

import java.util.List;

public class Offer implements Item {
	private String name;
	private double price;
	private List<Item> items;

	public Offer(String name, double price, List<Item> items) {
		super();
		this.name = name;
		this.price = price;
		this.items = items;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;

	}

	public String toString() {
		String ret = "Offer... " + name + "$ " + price + "\n";

		for (Item item : items) {
			ret+=item.toString();
		}
		return ret;

	}

}
