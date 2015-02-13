/* Represents a transaction :
 *  0. Receives a full cart from customer.
 *  1. Chose the form of payment.
 *  2. Apply the correspondent discount.
 *  3. Make payment.                             */

public class Transaction {

	private ShoppingCart cart;
	private static int ID = 0;

	public Transaction(ShoppingCart cart, Payment paymentMethod) {

		this.cart = cart;
		Transaction.ID++;

	}

	public void Purchase(Payment paymentMethod) {

		float total = cart.totalPrice();

		paymentMethod.pay(total);

		float totalDiscounted = paymentMethod.getDiscount().applyDiscount(cart.getItems(), total);

		System.out.println("Total cost of purchase : $" + totalDiscounted + " thanks for buying!");

		System.out.println("------Number of transaction : " + ID);

	}

}
