package key_one;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;

	public CreditCardStrategy(String name, String cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(float amount) {
		System.out.println(amount + " paid with credit card");
	}

}
