package key_one;

import java.util.LinkedList;

public class ShoppingCart {

	private LinkedList<ItemElement> shoppingList;

	public ShoppingCart() {
		shoppingList = new LinkedList<ItemElement>();
	}

	public void addItem(ItemElement item) {
		shoppingList.add(item);
	}

	public float calculatePrice() {
		float sum = 0;
		for (ItemElement item : shoppingList) {
			sum = sum + item.getPrice();
		}
		return sum;
	}

	public void pay(PaymentStrategy paymentMethod) {
		float amount = calculatePrice();
		paymentMethod.pay(amount);
	}

	public int getCantItems() {
		return shoppingList.size();
	}
}
