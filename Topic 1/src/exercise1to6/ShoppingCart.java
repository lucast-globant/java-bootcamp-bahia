package exercise1to6;

import java.util.ArrayList;
import java.util.List;

import exercise1to6.payments.Payment;

public class ShoppingCart {
	private Payment payment;
	private List<Item> items;

	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	public Transaction checkOut() {
		double total=payment.getDiscount().makeDiscount(items);
		payment.pay(total);
		items.clear();
		Transaction t= new Transaction(total, payment);
		//notify
		return t;
		
	}

	public void addItem(Item item) {
		this.items.add(item);
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
	public void clear(){
		items.clear();
	}

}
