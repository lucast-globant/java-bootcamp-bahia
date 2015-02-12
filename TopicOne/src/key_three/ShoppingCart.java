package key_three;

import java.util.LinkedList;

public class ShoppingCart {

	private LinkedList<ItemElement> shoppingList;

	public ShoppingCart() {
		shoppingList = new LinkedList<ItemElement>();
	}

	public void addItem(ItemElement item) {
		shoppingList.add(item);
	}

	public void pay(PaymentStrategy paymentMethod) {
		float amount = paymentMethod.calculatePrice(shoppingList);
		PaymentTransaction newTransaction = new PaymentTransaction(amount, shoppingList);
		paymentMethod.pay(newTransaction);
	}

	public int getCantItems() {
		return shoppingList.size();
	}
}
