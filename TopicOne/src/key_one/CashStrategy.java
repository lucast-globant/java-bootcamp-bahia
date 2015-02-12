package key_one;

public class CashStrategy implements PaymentStrategy {

	@Override
	public void pay(float amount) {
		System.out.println(amount + " paid using cash.");
	}
}
