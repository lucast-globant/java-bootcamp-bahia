package key_two;

import java.util.LinkedList;
import java.util.List;

public class Shopping {

	private List<ItemElement> shoppingStock;

	public Shopping() {
		shoppingStock = new LinkedList<ItemElement>();
	}

	public void addItem(ItemElement item) {
		shoppingStock.add(item);
		SingletonNotificationManager.getInstance().newNotification(
				"New item " + item.toString() + " added");
	}

	public void deleteItem(ItemElement item) {
		shoppingStock.remove(item);
		SingletonNotificationManager.getInstance().newNotification(
				"Item " + item.toString() + " removed");
	}

	public void newSale(PaymentTransaction paymentTransaction) {
		List<ItemElement> aux = paymentTransaction.getItems();
		for (ItemElement item : aux) {
			shoppingStock.remove(item);
		}
		SingletonNotificationManager.getInstance().newNotification(
				"A transaction for " + paymentTransaction.getAmountOfMoney()
						+ "$ was made");
	}

	public String getStockAsString() {
		String toR = "";
		for (ItemElement item : shoppingStock) {
			toR += item.toString() + '\n';
		}
		return toR;
	}
}
