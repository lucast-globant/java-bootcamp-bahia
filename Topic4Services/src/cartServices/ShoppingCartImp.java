package cartServices;

import items.Item;

import java.util.List;

import payments.Payment;

public class ShoppingCartImp implements ShoppingCartService {

	private Cart cart;
	private Container container;

	public ShoppingCartImp(Cart cart, Container container) {
		this.cart = cart;
		this.container = container;

	}

	@Override
	public double purchaseCart(Cart cart, Payment paymentMethod) {
		Transaction transaction = new Transaction(cart, paymentMethod);
		return transaction.Purchase();
	}

	@Override
	public Item findItem(String name, String category) {

		for (Item i : container.items())

			if (i.getName().equals(name))

				return i;

		return null;

	}

	@Override
	public Cart getCart() {
		return cart;
	}

	@Override
	public boolean saveCart(Cart cart) {
		this.cart = cart;
		return true;

	}

	@Override
	public List<Item> getItems() {
		return container.items();
	}

}
