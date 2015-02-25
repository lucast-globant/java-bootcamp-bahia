package classes;

import interfaces.Item;
import interfaces.PaymentStrategy;
import java.util.List;

public class CashStrategy implements PaymentStrategy {

	public double pay(List<Item> items) {
		double total = 0;
		double value;
		Item mostExpensiveItem = null;// this product will have a discount of
										// 90%
		for (Item item : items) {
			value = item.getValue();
			total += value;
			if (mostExpensiveItem == null || value > mostExpensiveItem.getValue()) {
				mostExpensiveItem = item;
			}
		}
		System.out.println("Cost of the buy: $" + total + ".");
		total -= mostExpensiveItem.getValue() * 0.9;
		System.out.println("You have a discount of 90% in the most expensive item for paying by cash.");
		System.out.println("Final cost: $" + total);
		return total;
	}
}