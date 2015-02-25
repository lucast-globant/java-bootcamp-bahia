package Topic_4.Services;

import java.util.List;

import Topic_4.ShoppingCart.Items.Item;
import Topic_4.ShoppingCart.PaymentMethod.PaymentMethod;
import Topic_4.ShoppingCart.Transactions.Transaction;

public class CartServiceProxy implements CartService {
	private CartService implementation;

	public CartServiceProxy(CartService implementation) {
		this.implementation = implementation;
	}

	public void addItem(Item item) {
		this.implementation.addItem(item);
	}

	public void removeItem(Item item) {
		this.implementation.removeItem(item);
	}

	public List<Item> getItems() {
		return implementation.getItems();
	}

	public float getSubtotal() {
		return implementation.getSubtotal();
	}

	public Transaction buy(PaymentMethod paymentm) {
		return implementation.buy(paymentm);
	}

}
