package topic1.payment;

import topic1.ShoppingCart;

public class CashPayment implements PaymentStrategy {

	//90% discount in the most expensive product
	public void pay (long paymentCod, ShoppingCart cart) {
		double amount = cart.totalPrice(),
				discount = (0.9 * cart.mostExpensiveItem().getPrice()),
				totalPay = amount - discount;
		System.out.println ("Payment code "+paymentCod);
		System.out.println ("$"+totalPay+" has been paid in cash.\n"
				+"Detail: Total price: $"+amount+" with the 90% of most expensive product discount in cash payments.");
	}

}
