package exercise1to6.payments;

import exercise1to6.discount.Discount;

public class Paypal extends PaymentType {

	private String email;
	private String password;

	public Paypal(String email, String password,Discount discount) {
		super(discount);
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(double total) {
		// make payment with Paypal

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
