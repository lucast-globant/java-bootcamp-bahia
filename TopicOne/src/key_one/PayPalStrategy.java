package key_one;

public class PayPalStrategy implements PaymentStrategy {

	private String email;
	private String password;

	public PayPalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(float amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
