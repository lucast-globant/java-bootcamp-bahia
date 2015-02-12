package key_two;

import java.util.LinkedList;

public interface PaymentStrategy {

	public void pay(float amount);

	public float calculatePrice(LinkedList<ItemElement> items);
}
