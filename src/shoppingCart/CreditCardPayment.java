package shoppingCart;

import java.util.Date;

public class CreditCardPayment extends Payment {
	private String clientName, creditCardNo;

	public CreditCardPayment(String clientName, String creditCardNumber,
			ShoppingCart cart, String clientId) {
		super();
		this.setClientName(clientName);
		this.setCreditCardNo(creditCardNumber);
		this.shopCart = cart;
		this.clientID = clientId;
		this.date = new Date();
	}

	@Override
	public float applyDiscount() {
		if (!shopCart.equals(null)) {
			return (shopCart.getTotal() * 0.9f);
		} else {
			return 0;
		}
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return date.toString() + "\nTransaction:"
				+ String.format("%06d", transactionNumber) + "\nClient: "
				+ clientID + "\nPaying with Credit card No." + creditCardNo
				+ "\n" + shopCart.toString()
				+ "__________________________\nTotal: "
				+ String.format("%.2f", shopCart.getTotal())
				+ "\n__________________________\nWith discount: "
				+ String.format("%.2f", this.applyDiscount());
	}

}
