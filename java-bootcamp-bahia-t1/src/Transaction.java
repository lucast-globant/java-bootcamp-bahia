/* Represents a transaction :
 *  0. Receives a full cart from customer.
 *  1. Chose the form of payment.
 *  2. Apply the correspondent discount.
 *  3. Make payment.                             */

public class Transaction {

	private ShoppingCart cart;

	public Transaction(int iD) {

	}

	public void pay(Payment paymentMethod) {
		int total = cart.totalPrice();

		paymentMethod.pay(total);
	}

}
