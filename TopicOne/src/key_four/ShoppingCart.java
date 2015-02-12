package key_four;

import java.util.LinkedList;

public class ShoppingCart {

	private LinkedList<ItemElement> shoppingList;
	private SingletonShopping shopping;

	public ShoppingCart() {
		shoppingList = new LinkedList<ItemElement>();
		shopping = SingletonShopping.getInstance();
	}

	public void addItem(ItemElement item) {
		shoppingList.add(item);
	}

	public void pay(PaymentStrategy paymentMethod) {
		float amount = paymentMethod.calculatePrice(shoppingList);
		PaymentTransaction newTransaction = new PaymentTransaction(amount, shoppingList);
		paymentMethod.pay(newTransaction);
		shopping.newSale(newTransaction);
	}

	public int getCantItems() {
		return shoppingList.size();
	}

}
