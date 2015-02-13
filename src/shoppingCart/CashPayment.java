package shoppingCart;

import java.util.Date;

public class CashPayment extends Payment {

	public CashPayment(ShoppingCart cart, String clientId) {
		super();
		this.shopCart = cart;
		this.clientID = clientId;
		this.date = new Date();
	}

	@Override
	float applyDiscount() {
		if (!shopCart.equals(null)) {
			Item mostExpensive = shopCart.getMostExpensiveItem();
			float discount = mostExpensive.getProduct().getPrice() * 0.9f;
			if (!mostExpensive.getProduct().isUnit()) {
				discount = discount * mostExpensive.getQuantity();
			}
			return (shopCart.getTotal() - discount);
		} else {
			return 0;
		}
	}

}
