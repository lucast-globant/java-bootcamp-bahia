package exercise1to6;

import java.util.HashMap;
import java.util.Observable;

public class Stock extends Observable {
	private static Stock stock;
	private HashMap<String, Item> items;

	private Stock() {
		items = new HashMap<String, Item>();

	}

	public static Stock getInstance() {
		if (stock == null)
			return new Stock();
		return stock;
	}

	public void addItem(Item i) {
		items.put(i.getName(), i);
	
		
	}

	private void notifyPriceChange(Item i) {
		this.setChanged();
		this.notifyObservers("Item " + i.getName() + "has changed price to " + i.getPrice()+ "\n");
	}

	public void changePrice(String name, float newPrice) {
		Item i = items.get(name);
		if (i != null) {
			i.setPrice(newPrice);
			notifyPriceChange(i);
		}
	}

	public boolean avilable(Item item) {
		
		return true; // for now, lets assume that we have stock.
	}

}
