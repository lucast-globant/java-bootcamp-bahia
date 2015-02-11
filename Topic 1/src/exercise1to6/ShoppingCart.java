package exercise1to6;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private Payment payment;
	private List<Product> items;

	public ShoppingCart() {
		items = new ArrayList<Product>();
	}

	public Transaction checkOut() {
		return null;
	}

	public void addItem(Product item) {
		this.items.add(item);
	}
	public void removeItem(Product item) {
		this.items.remove(item);
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
