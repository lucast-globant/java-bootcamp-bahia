package exercise1to6;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import exercise1to6.payments.Payment;

public class ShoppingCart extends Observable {
	private Payment payment;
	private List<Item> items;
	private Stock stock;

	@SuppressWarnings("static-access")
	public ShoppingCart() {
		items = new ArrayList<Item>();
		this.stock = stock.getInstance();
	}

	public Transaction checkOut() {
		double total = payment.getDiscount().makeDiscount(items);
		payment.pay(total);
		items.clear();
		Transaction t = new Transaction(total, payment);
		notifyTransactionChange(t);

		return t;

	}

	public void addItem(Item item) {
		if (stock.avilable(item)) {
			this.notifyItemAdded(item);
			this.items.add(item);
		} else
			System.out.println("Item: " + item.getName() + "out of stock \n");

	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void clear() {
		items.clear();
	}

	public String toString() {
		String ret = "Shopping Cart: \n";
		for (Item item : items) {
			ret += item.toString();
		}
		return ret;
	}

	private void notifyTransactionChange(Transaction t) {
		this.setChanged();
		this.notifyObservers("Transaction Executed. Number: " + t.getIdTransaction() + "\n");
	}

	private void notifyItemAdded(Item item) {
		this.setChanged();
		this.notifyObservers("Item " + item.getName() + " has added to the cart " + item.getPrice() + "\n");
	}

}
