package classes;

import java.util.ArrayList;
import java.util.List;
import interfaces.Item;
import interfaces.PaymentStrategy;
import interfaces.ShoppingCart;

public class FunctionalShoppingCart implements ShoppingCart {

	private List<Item> items;
	private PaymentStrategy payment;

	public FunctionalShoppingCart() {
		items = new ArrayList<Item>();
		payment = null;
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public List<Item> getItems() {
		return items;
	}

	@Override
	public void addPayment(PaymentStrategy payment) {
		this.payment = payment;
	}

	@Override
	public void removePayment() {
		payment = null;

	}

	@Override
	public PaymentStrategy getPayment() {
		return payment;
	}
}
