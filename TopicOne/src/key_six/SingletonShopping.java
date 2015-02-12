package key_six;

import java.util.LinkedList;

public class SingletonShopping {

	private static SingletonShopping shoppingInstance = null;
	private LinkedList<ItemElement> shoppingStock = new LinkedList<ItemElement>();

	private SingletonShopping() {
	}

	public static SingletonShopping getInstance() {
		if (shoppingInstance == null) {
			shoppingInstance = new SingletonShopping();
		}
		return shoppingInstance;
	}

	public void addItem(ItemElement item) {
		shoppingStock.add(item);
		SingletonNotificationManager.getInstance().newNotification("New item " + item.toString() + " added");
	}

	public void newSale(PaymentTransaction paymentTransaction) {
		LinkedList<ItemElement> aux = paymentTransaction.getItems();
		for (ItemElement item : aux) {
			shoppingStock.remove(item);
		}
		SingletonNotificationManager.getInstance().newNotification(
				"A transaction for " + paymentTransaction.getAmountOfMoney() + "$ was made");
	}

	public String getStockAsString() {
		String toR = "";
		for (ItemElement item : shoppingStock) {
			toR += item.toString() + '\n';
		}
		return toR;
	}
}
