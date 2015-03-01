package PaymentMethod;

import ShopingCart.Cart;

public interface PaymentMethod {

	public float applyDiscount(Cart cart);

	public String toString();

}
