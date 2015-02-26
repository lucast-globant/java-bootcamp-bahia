package interfaces;

import java.util.List;

public interface ShoppingCart {

	public void addItem(Item item);

	public void removeItem(Item item);

	public List<Item> getItems();

	public void addPayment(PaymentStrategy payment);

	public void removePayment();

	public PaymentStrategy getPayment();
}
