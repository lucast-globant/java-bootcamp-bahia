package ex2.Services;

import java.util.List;

import ex2.Payments.Payment;
import ex2.ShoppingCart.Item;
import ex2.ShoppingCart.Transaction;

public interface CartService {
	public void addItem(Item item);

	public void removeItem(Item item);

	public List<Item> getItems();

	public float getSubtotal();

	public Transaction checkOut(Payment payment);

}
