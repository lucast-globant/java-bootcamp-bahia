import java.util.ArrayList;

public class CashStrategy implements PaymentStrategy {
	
	public double pay(ArrayList<Item> items) {
		double total = 0;
		double value;
		Item mostExpensiveItem = null;//this product will have a discount of 90%
		for (Item p: items) {
			value = p.getValue();
			total += value;
			if (mostExpensiveItem == null || value > mostExpensiveItem.getValue()) {
				mostExpensiveItem = p;}}
		System.out.println("Cost of the buy: $" + total + ".");
		total -= mostExpensiveItem.getValue() * 0.9;
		System.out.println("You have a discount of 90% in the most expensive item for paying by cash.");
		System.out.println("Final cost: $" + total);
		return total;
	}
}
