package cartServices;

import items.Item;

import java.util.List;

import payments.Payment;

public interface ShoppingCartService {

	public double purchaseCart(Cart cart, Payment paymentMethod);

	public Item findItem(String name, String category);

	public Cart getCart();

	public boolean saveCart(Cart cart);

	public List<Item> getItems();

}
