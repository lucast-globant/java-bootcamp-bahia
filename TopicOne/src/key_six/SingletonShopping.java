package key_six;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class SingletonShopping implements NotificationSubject {

	private static SingletonShopping shoppingInstance = null;
	private LinkedList<ItemElement> shoppingStock = new LinkedList<ItemElement>();
	// this set is the mail list.
	Set<NotificationObserver> mailList = new HashSet<NotificationObserver>();
	private String message = "";

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
		newNotification("New item " + item.toString() + " added");
	}

	public void newSale(PaymentTransaction paymentTransaction) {
		LinkedList<ItemElement> aux = paymentTransaction.getItems();
		for (ItemElement item : aux) {
			shoppingStock.remove(item);
		}
		newNotification("A transaction for "
				+ paymentTransaction.getAmountOfMoney() + "$ was made");
	}

	public String getStockAsString() {
		String toR = "";
		for (ItemElement item : shoppingStock) {
			toR += item.toString() + '\n';
		}
		return toR;
	}

	@Override
	public void addObserver(NotificationObserver notificationObserver) {
		mailList.add(notificationObserver);
	}

	@Override
	public void removeObserver(NotificationObserver notificationObserver) {
		mailList.remove(notificationObserver);
	}

	@Override
	public void doNotify() {
		Iterator<NotificationObserver> it = mailList.iterator();
		while (it.hasNext()) {
			NotificationObserver notificationObserver = it.next();
			notificationObserver.mail(message);
		}
	}

	public void newNotification(String message) {
		this.message = message;
		doNotify();
	}
}
