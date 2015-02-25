package Topic_4.Services;

import java.util.List;

import Topic_4.ShoppingCart.Items.Item;
import Topic_4.ShoppingCart.PaymentMethod.PaymentMethod;
import Topic_4.ShoppingCart.Transactions.Transaction;

public interface CartService {

	public void addItem(Item item);

	public void removeItem(Item item);

	public List<Item> getItems();

	public float getSubtotal();

	public Transaction buy(PaymentMethod paymentm);

}
