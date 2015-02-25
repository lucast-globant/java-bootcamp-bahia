package Topic_4.ShoppingCart.ShopingCart;

import java.util.ArrayList;
import java.util.List;

import Topic_4.Services.CartService;
import Topic_4.ShoppingCart.Items.Item;
import Topic_4.ShoppingCart.Mailist.Mailist;
import Topic_4.ShoppingCart.Observer.Subject;
import Topic_4.ShoppingCart.PaymentMethod.PaymentMethod;
import Topic_4.ShoppingCart.Transactions.Transaction;

public class Cart implements Subject, CartService {
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

	public Transaction buy(PaymentMethod paymentm) {
		float total = paymentm.applyDiscount(items, subtotal);
		Transaction transaction = new Transaction(paymentm, items, total);
		doNotify("New transaction.");
		return transaction;
	}

	public void doNotify(String msg) {
		observer.update(msg);
	}

}
