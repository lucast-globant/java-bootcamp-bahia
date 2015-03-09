package topic_1;

public class Transaction {
	
	private Payment payment;
	private float totalPrice;
	private static int idTransaction;
	
	public Transaction(Payment payment, float totalPrice) {
		idTransaction = Counter.getCount();
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

	@Override
	public String toString() {
		return "Transaction: [ Transaction id = " + idTransaction + " payment = " + payment + ", totalPrice = " + totalPrice + "]";
	}

}
