package ShopingCart;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Observer.Observer;
import Observer.Subject;
import PaymentMethod.PaymentMethod;
import Transactions.Transaction;

public class Cart implements Subject {
	protected List<Item> items;
	protected List<Observer> observers;

	public Cart() {
		items = new ArrayList<Item>();
		observers = new ArrayList<Observer>();
	}

	public Cart(List<Observer> o) {
		items = new ArrayList<Item>();
		observers = o;
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public void removeItem(Item i) {
		items.remove(i);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> i) {
		items = i;
	}

	public double getSubtotal() {
		double s = 0;
		for (Item i : items) {
			s += i.getPrice();
		}
		return s;
	}

	public double getTotal(PaymentMethod p) {
		return p.applyDiscount(items, getSubtotal());
	}

	public Transaction buy(PaymentMethod p) {
		Transaction t = new Transaction(p, items, getTotal(p));
		doNotify("New transaction: \n" + t.toString());
		return t;
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
		String ss = "";
		for (Observer o : observers) {
			ss = o.getName() + ": -> ";
			o.update(ss + s);
		}
	}

}
