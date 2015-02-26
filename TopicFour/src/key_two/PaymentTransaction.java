package key_two;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PaymentTransaction {

	private int id;
	private float amountOfMoney;
	private List<ItemElement> items;

	public PaymentTransaction(float amountOfMoney, List<ItemElement> items) {
		this.id = SingletonCounter.getInstance().getUniqueId();
		this.amountOfMoney = amountOfMoney;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public float getAmountOfMoney() {
		return amountOfMoney;
	}

	public List<ItemElement> getItems() {
		return items;
	}
}
