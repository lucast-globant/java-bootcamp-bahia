package cartServices;

import java.util.List;

import payments.Payment;
import repositoryServices.Container;
import repositoryServices.Item;

public class ShoppingCartImp implements ShoppingCartService {

	private Cart cart;

	public ShoppingCartImp(Cart cart, Container container) {
		this.cart = cart;

	}

	@Override
	public double purchaseCart(Cart cart, Payment paymentMethod) {
		Transaction transaction = new Transaction(cart, paymentMethod);
		return transaction.Purchase();
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

}
