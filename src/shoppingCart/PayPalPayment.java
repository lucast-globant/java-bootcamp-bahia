package shoppingCart;

import java.util.Date;

public class PayPalPayment extends Payment {
	private String email, password;

	public PayPalPayment(String email, String password, ShoppingCart cart,
			String clientId) {
		super();
		this.setEmail(email);
		this.setPassword(password);
		this.shopCart = cart;
		this.clientID = clientId;
		this.date = new Date();
	}

	@Override
	float applyDiscount() {
		if (!shopCart.equals(null)) {
			Item cheapest = shopCart.getCheapestItem();
			float discount = cheapest.getProduct().getPrice();
			if (!cheapest.getProduct().isUnit()) {
				discount = discount * cheapest.getQuantity();
			}
			return (shopCart.getTotal() - discount);
		} else {
			return 0;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
