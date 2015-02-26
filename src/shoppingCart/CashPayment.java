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
	public float applyDiscount() {
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

	@Override
	public String toString() {
		return date.toString() + "\nTransaction:"
				+ String.format("%06d", transactionNumber) + "\nClient: "
				+ clientID + "\nPaying in Cash\n" + shopCart.toString()
				+ "__________________________\nTotal: "
				+ String.format("%.2f", shopCart.getTotal())
				+ "\n__________________________\nWith discount: "
				+ String.format("%.2f", this.applyDiscount());
	}
}
