package cartServices;

import java.util.List;

import payments.Payment;
import repositoryServices.Item;

public interface ShoppingCartService {

	public double purchaseCart(Cart cart, Payment paymentMethod);

	public Cart getCart();

	public boolean saveCart(Cart cart);

}
