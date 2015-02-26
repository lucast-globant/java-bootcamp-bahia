package cartServices;

import notifications.MailListManager;
import payments.Payment;
import items.*;

/* Represents a transaction :
 *  0. Receives a full cart from customer.
 *  1. Chose the form of payment.
 *  2. Apply the correspondent discount.
 *  3. Make payment.                             */

public class Transaction {

	private Cart cart;
	private static int ID = 0;
	private Payment paymentMethod;

	public Transaction(Cart cart, Payment paymentMethod) {

		this.cart = cart;
		Transaction.ID++;
		this.paymentMethod = paymentMethod;

	}

	public double Purchase() {

		float total = cart.totalPrice();

		paymentMethod.pay(total);

		double totalDiscount = paymentMethod.getDiscount().applyDiscount(cart.getItems(), total);

		MailListManager.getInstance().setMessage(" New Transaction was made ID: " + Transaction.ID);

		return totalDiscount;

	}

}
