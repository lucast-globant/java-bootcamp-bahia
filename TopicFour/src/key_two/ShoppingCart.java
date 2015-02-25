package key_two;

import java.util.LinkedList;

public class ShoppingCart {

	private LinkedList<ItemElement> shoppingList;
	private Shopping shopping;

	public ShoppingCart(Shopping shopping) {
		shoppingList = new LinkedList<ItemElement>();
		this.shopping = shopping;
	}

	public void addItem(ItemElement item) {
		shoppingList.add(item);
	}

	public void pay(PaymentStrategy paymentMethod) {
		float amount = paymentMethod.calculatePrice(shoppingList);
		PaymentTransaction newTransaction = new PaymentTransaction(amount,
				shoppingList);
		paymentMethod.pay(newTransaction);
		shopping.newSale(newTransaction);
	}

	public int getCantItems() {
		return shoppingList.size();
	}

}
