package topic_1;

public class Transaction {
	
	private Payment payment;
	private float totalPrice;
	private static int idTransaction = 0;
	
	public Transaction(Payment payment, float totalPrice) {
		idTransaction++;
		this.payment = payment;
		this.totalPrice = totalPrice;
	}

	public Payment getPayment() {
		return payment;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public static int getIdTransaction() {
		return idTransaction;
	}
	
}
