package classes;

import interfaces.Item;
import interfaces.PaymentStrategy;
import java.util.List;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private int creditNumber;

	public CreditCardStrategy(String name, int creditNumber) {
		this.name = name;
		this.creditNumber = creditNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

	public double pay(List<Item> items) {
		double total = 0;
		for (Item item : items) {
			total += item.getValue();
		}
		total *= 0.9;
		return total;
	}
}
