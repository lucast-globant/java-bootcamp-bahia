package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartService implements IShoppingCartService {
	private List<ShoppingCart> shoppingCartsDB;
	private List<Payment> transactionsDB;
	private Store store;

	public ShoppingCartService() {
		shoppingCartsDB = new ArrayList<ShoppingCart>();
		transactionsDB = new ArrayList<Payment>();
		store = new Store();
		store.createExampleProducts();
	}

	@Override
	public void createCart(String userId) {
		int index = getCartIndexOfOwner(userId);
		if (index >= 0) {
			shoppingCartsDB.set(index, new ShoppingCart(userId));
		} else {
			shoppingCartsDB.add(new ShoppingCart(userId));
		}
	}

	@Override
	public void payAndCheckout(Payment payment) {
		String user;
		transactionsDB.add(payment);
		user = payment.getCart().getOwner();
		createCart(user);
	}

	@Override
	public void addItem(String userId, int idProduct, float quantity) {
		int index = getCartIndexOfOwner(userId);
		ShoppingCart cart;
		if (index < 0) {
			cart = new ShoppingCart(userId);
			cart.addItem(store.getProduct(idProduct), quantity);
			shoppingCartsDB.add(cart);
		} else {
			cart = shoppingCartsDB.get(index);
			cart.addItem(store.getProduct(idProduct), quantity);
			shoppingCartsDB.set(index, cart);
		}
	}

	@Override
	public void removeItem(String userId, int idProduct) {
		int index = getCartIndexOfOwner(userId);
		ShoppingCart cart = shoppingCartsDB.get(index);
		cart.removeItem(idProduct);
		shoppingCartsDB.set(index, cart);
	}

	private int getCartIndexOfOwner(String userId) {
		int i = 0;
		boolean found = false;
		while (!found && i < shoppingCartsDB.size()) {
			found = shoppingCartsDB.get(i).getOwner().equals(userId);
			i++;
		}
		if (found) {
			return i - 1;
		} else {
			return -1;
		}
	}

	@Override
	public ShoppingCart getShoppingCart(String userId) {
		int index = getCartIndexOfOwner(userId);
		if (index >= 0) {
			return shoppingCartsDB.get(index);
		} else {
			return null;
		}
	}

	@Override
	public int numberOfShoppingCarts() {
		return shoppingCartsDB.size();
	}

	@Override
	public int numberOfTransactions() {
		return transactionsDB.size();
	}
}
