package key_four;

import java.util.LinkedList;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;

	public CreditCardStrategy(String name, String cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(PaymentTransaction paymentTransaction) {
		System.out.println(paymentTransaction.getAmountOfMoney() + " paid with credit card");
	}

	@Override
	// 10% discount
	public float calculatePrice(LinkedList<ItemElement> items) {
		float sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.getPrice();
		}
		sum = (float) (sum - (sum * 0.1));
		return sum;
	}

}
