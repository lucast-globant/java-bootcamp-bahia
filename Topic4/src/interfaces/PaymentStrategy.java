package interfaces;

import java.util.List;

public interface PaymentStrategy {

	public double pay(List<Item> items);
}
