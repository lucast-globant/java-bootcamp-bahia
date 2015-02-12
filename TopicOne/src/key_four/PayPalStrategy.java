package key_four;

import java.util.LinkedList;

public class PayPalStrategy implements PaymentStrategy {

	private String email;
	private String password;

	public PayPalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(PaymentTransaction paymentTransaction) {
		System.out.println(paymentTransaction.getAmountOfMoney() + " paid using Paypal.");
	}

	@Override
	// the cheapest item is for free
	public float calculatePrice(LinkedList<ItemElement> items) {
		float sum = 0;
		float cheapest = 0;
		for (ItemElement item : items) {
			float aux = item.getPrice();
			sum = sum + aux;
			if (cheapest == 0.0)
				cheapest = aux;
			else {
				if (aux < cheapest)
					cheapest = aux;
			}
		}
		sum = sum - cheapest;
		return sum;
	}

}
