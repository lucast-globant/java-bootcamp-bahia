package ex2.Payments;

import ex2.Discount.*;


public class Paypal extends PaymentType {

	private String email;
	private String password;

	public Paypal(String email, String password) {
		super(new PaypalDiscount() );
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(double total) {
		System.out.println("Payment Made by: PAYPAL \n");

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
