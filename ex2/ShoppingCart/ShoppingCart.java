package ex2.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import ex2.Payments.Payment;
import ex2.Services.CartService;

public class ShoppingCart extends Observable implements CartService {

	private List<Item> items;
	private Stock stock;


	public ShoppingCart() {
		items = new ArrayList<Item>();
		this.stock = Stock.getInstance();
	}

	public Transaction checkOut(Payment payment) {
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

	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getSubtotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
