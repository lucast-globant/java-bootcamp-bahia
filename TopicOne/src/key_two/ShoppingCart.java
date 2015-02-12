package key_two;

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
		paymentMethod.pay(amount);
	}

	public int getCantItems() {
		return shoppingList.size();
	}
}
