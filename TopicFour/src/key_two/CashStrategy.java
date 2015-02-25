package key_two;

import java.util.LinkedList;
import java.util.List;

public class CashStrategy implements PaymentStrategy {

	@Override
	public void pay(PaymentTransaction paymentTransaction) {
		System.out.println(paymentTransaction.getAmountOfMoney()
				+ " paid using cash.");
	}

	@Override
	// 90% of the most expensive item is free
	public float calculatePrice(List<ItemElement> items) {
		float sum = 0;
		float mostExpensive = 0;
		for (ItemElement item : items) {
			float aux = item.getPrice();
			sum = sum + aux;
			if (mostExpensive == 0)
				mostExpensive = aux;
			else {
				if (aux > mostExpensive)
					mostExpensive = aux;
			}
		}
		float discount = (float) (mostExpensive * 0.9);
		sum = sum - discount;
		return sum;
	}
}
