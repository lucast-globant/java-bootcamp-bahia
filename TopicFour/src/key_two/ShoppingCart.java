package key_two;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

	private List<ItemElement> shoppingList;
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
		PaymentTransaction newTransaction = new PaymentTransaction(amount,
				shoppingList);
		paymentMethod.pay(newTransaction);
		shopping.newSale(newTransaction);
	}

	public int getCantItems() {
		return shoppingList.size();
	}

}
