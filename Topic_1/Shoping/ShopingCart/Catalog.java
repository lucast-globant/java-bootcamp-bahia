package ShopingCart;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Items.Product;
import Items.Offer;
import Mailist.Mailist;
import Observer.Subject;

public class Catalog implements Subject {
	protected List<Item> items;
	protected Mailist observer;

	public Catalog() {
		items = new ArrayList<Item>();
		observer = new Mailist();
	}

	public Catalog(Mailist mailist) {
		items = new ArrayList<Item>();
		this.observer = mailist;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void createProduct(String name, float price) {
		Product i = new Product(name, price);
		this.items.add(i);
		doNotify("New product.");
	}

	public void createOffer(String name, float price, List<Item> items) {
		Offer o = new Offer(name, price, items);
		this.items.add(o);
		doNotify("New offer.");
	}

	public void setPrice(Item item, float price) {
		item.setPrice(price);
		doNotify("Price is changed.");
	}

	public void displayItems() {
		String s = "Items:\n";
		for (Item i : items) {
			s += i.toString();
		}
		System.out.println(s);
	}

	public void doNotify(String msg) {
		observer.update(msg);
	}

}
