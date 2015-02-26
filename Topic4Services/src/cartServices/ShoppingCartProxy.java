package cartServices;

import items.Item;

import java.util.List;

import payments.Payment;

public class ShoppingCartProxy implements ShoppingCartService {

	ShoppingCartImp shoppingCartImp;

	@Override
	public double purchaseCart(Cart cart, Payment paymentMethod) {
		return shoppingCartImp.purchaseCart(cart, paymentMethod);
	}

	@Override
	public Item findItem(String name, String category) {
		return shoppingCartImp.findItem(name, category);
	}

	@Override
	public Cart getCart() {
		return shoppingCartImp.getCart();
	}

	@Override
	public boolean saveCart(Cart cart) {
		return shoppingCartImp.saveCart(cart);
	}

	@Override
	public List<Item> getItems() {
		return shoppingCartImp.getItems();
	}

}
