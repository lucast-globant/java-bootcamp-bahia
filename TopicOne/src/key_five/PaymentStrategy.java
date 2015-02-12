package key_five;

import java.util.LinkedList;

public interface PaymentStrategy {

	public void pay(PaymentTransaction paymentTransaction);

	public float calculatePrice(LinkedList<ItemElement> items);
}
