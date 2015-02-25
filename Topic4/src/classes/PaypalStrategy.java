package classes;

import interfaces.Item;
import interfaces.PaymentStrategy;
import java.util.List;

public class PaypalStrategy implements PaymentStrategy {

	private String email;
	private String password;

	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double pay(List<Item> items) {
		double total = 0;
		double value;
		Item cheapestItem = null;// this item is free
		for (Item item : items) {
			value = item.getValue();
			total += value;
			if (cheapestItem == null || value < cheapestItem.getValue()) {
				cheapestItem = item;
			}
		}
		System.out.println("Cost of the buy: $" + total + ".");
		total -= cheapestItem.getValue();
		System.out.println("The cheapest item for $" + cheapestItem.getValue() + " is free by paying with Paypal.");
		System.out.println("Final cost: $" + total);
		return total;
	}
}
