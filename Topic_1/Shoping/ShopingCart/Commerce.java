package ShopingCart;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Items.Offer;
import Observer.Observer;
import Observer.Subject;

public class Commerce implements Subject {
	protected List<Item> catalog;
	protected List<Observer> observers;

	public Commerce() {
		catalog = new ArrayList<Item>();
		observers = new ArrayList<Observer>();
	}

	public Commerce(List<Observer> l) {
		catalog = new ArrayList<Item>();
		observers = l;
	}

	public List<Item> getCatalog() {
		return catalog;
	}

	public void setCatalog(List<Item> c) {
		catalog = c;
	}

	public void createItem(String name, double price) {
		Item i = new Item(name, price);
		catalog.add(i);
		doNotify("New product: \n" + i.toString());
	}

	public void createOffer(String name, double price, List<Item> items) {
		Offer o = new Offer(name, price, items);
		catalog.add(o);
		doNotify("New offer: \n" + o.toString());
	}

	public void setPrice(Item i, double price) {
		i.setPrice(price);
		doNotify("Price is changed: \n" + i.toString());
	}

	public Item getItemForName(String name) {
		for (Item i : catalog) {
			if (i.getName() == name)
				return i;
		}
		return null;
	}

	public void displayItems() {
		String s = "Items:\n";
		for (Item i : catalog) {
			s += i.toString();
		}
		System.out.println(s);
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void doNotify(String s) {
		String ss;
		for (Observer o : observers) {
			ss = o.getName() + " -> ";
			o.update(ss + s);
		}
	}

}
