package cartServices;

import java.util.List;

import payments.Payment;
import repositoryServices.Item;

public class ShoppingCartProxy implements ShoppingCartService {

	ShoppingCartImp shoppingCartImp;

	@Override
	public double purchaseCart(Cart cart, Payment paymentMethod) {
		return shoppingCartImp.purchaseCart(cart, paymentMethod);
	}

	@Override
	public Cart getCart() {
		return shoppingCartImp.getCart();
	}

	@Override
	public boolean saveCart(Cart cart) {
		return shoppingCartImp.saveCart(cart);
	}

}
