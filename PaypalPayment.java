package topic1.payment;

import topic1.ShoppingCart;

public class PaypalPayment implements PaymentStrategy {
	
	private String email;
	private String password;
	
	public PaypalPayment(String email, String password) {
		this.email = email;
		this.password = password;
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

	public void pay (long paymentCod, ShoppingCart cart) {
		double amount = cart.totalPrice(),
				discount = cart.cheapestItem().getPrice(),
				totalPay = amount;
		if (discount != amount) {
			totalPay -= discount;
		}
		System.out.println ("Payment code "+paymentCod);
		System.out.println ("$"+totalPay+" has been paid by Paypal.\n"
				+"Detail: Total price: $"+amount+" with the cheapest product for free by Paypal payment.");
	}

}
