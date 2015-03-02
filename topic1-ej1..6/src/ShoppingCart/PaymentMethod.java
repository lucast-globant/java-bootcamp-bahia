package ShoppingCart;

import java.util.List;

public interface PaymentMethod {
	public void pay(float amount, List<Item> items, int id);
}