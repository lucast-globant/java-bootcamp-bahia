package key_two;

import java.util.LinkedList;
import java.util.List;

public interface PaymentStrategy {

	public void pay(PaymentTransaction paymentTransaction);

	public float calculatePrice(List<ItemElement> items);
}
