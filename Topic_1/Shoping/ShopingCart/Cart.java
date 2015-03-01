package ShopingCart;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Mailist.Mailist;
import Observer.Subject;
import PaymentMethod.PaymentMethod;
import Transactions.Transaction;

public class Cart implements Subject {
	protected List<Item> items;
	protected Mailist observer;
	protected float subtotal;

	public Cart() {
		items = new ArrayList<Item>();
		observer = new Mailist();
		subtotal = 0;
	}

	public Cart(Mailist mailist) {
		items = new ArrayList<Item>();
		this.observer = mailist;
		subtotal = 0;
	}

	public void addItem(Item item) {
		items.add(item);
		subtotal += item.getPrice();
	}

	public void removeItem(Item item) {
		items.remove(item);
		subtotal -= item.getPrice();
	}

	public List<Item> getItems() {
		return items;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public Item getMostExpensiveItem() {
		if (items.size() == 0)
			return null;
		Item expensive = items.get(0);
		for (Item i : items) {
			if (i.getPrice() > expensive.getPrice())
				expensive = i;
		}
		return expensive;
	}

	public Item getCheapestItem() {
		if (items.size() == 0)
			return null;
		Item cheapest = items.get(0);
		for (Item i : items) {
			if (i.getPrice() < cheapest.getPrice())
				cheapest = i;
		}
		return cheapest;
	}

	public Transaction buy(PaymentMethod paymentm) {
		float total = paymentm.applyDiscount(this);
		Transaction transaction = new Transaction(paymentm, items, total);
		doNotify("New transaction.");
		return transaction;
	}

	public void doNotify(String msg) {
		observer.update(msg);
	}

}
