import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> items;
	private Transaction transaction = null;

	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item p) {
		items.add(p);
	}

	public void removeItem(Item p) {
		items.remove(p);
	}

	public int numberOfItems() {
		return items.size();
	}

	public void displayItems() {
		double total = 0;
		System.out.println("List of items selected: ");
		for (Item p : items) {
			total += p.getValue();
			System.out.print(p.display());
		}
		System.out.println("Total: $" + total + '\n');
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	// When the user wants to pay, the transaction is created and executed
	public void pay(PaymentStrategy paymentStrategy) {
		transaction = new Transaction(items, paymentStrategy);
		transaction.execute();
	}
}