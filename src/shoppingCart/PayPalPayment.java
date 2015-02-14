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
	public float applyDiscount() {
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

	@Override
	public String toString() {
		return date.toString() + "\nTransaction:"
				+ String.format("%06d", transactionNumber) + "\nClient: "
				+ clientID + "\nPaying via PayPal. E-mail: " + email + "\n"
				+ shopCart.toString() + "__________________________\nTotal: "
				+ String.format("%.2f", shopCart.getTotal())
				+ "\n__________________________\nWith discount: "
				+ String.format("%.2f", this.applyDiscount());
	}

}
