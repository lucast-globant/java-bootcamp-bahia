package ex2.Services;

import java.util.List;

import ex2.Payments.Payment;
import ex2.ShoppingCart.Item;
import ex2.ShoppingCart.Transaction;

public class CartServiceProxy {
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

	public Transaction buy(Payment paymentm) {
		return implementation.checkOut(paymentm);
	}

}
