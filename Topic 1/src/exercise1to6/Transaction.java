package exercise1to6;

public class Transaction {
	private static int idTransaction = 1;
	private static int ID;
	private Payment payment;
	private double total;

	public Transaction(double total, Payment payment) {
		this.setPayment(payment);
		this.setTotal(total);
		this.ID = this.getNewIDTransaction();
	}

	private int getNewIDTransaction() {
		return idTransaction++;
	}

	private int getIdTransaction() {
		return ID;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
