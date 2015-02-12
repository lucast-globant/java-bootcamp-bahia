package key_three;

import java.util.LinkedList;

public interface PaymentStrategy {

	public void pay(PaymentTransaction paymentTransaction);

	public float calculatePrice(LinkedList<ItemElement> items);
}
