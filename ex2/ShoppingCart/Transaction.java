package ex2.ShoppingCart;


import ex2.Payments.Payment;

public class Transaction {
	private static int idTransaction = 1;
	private int ID;
	private Payment payment;
	private double total;

	public Transaction(double total, Payment payment) {
		this.setPayment(payment);
		this.total=total;
		this.ID = this.getNewIDTransaction();
	}

	private int getNewIDTransaction() {
		return idTransaction++;
	}

	public int getIdTransaction() {
		return ID;
	}

	public double getTotal() {
		return total;
	}


	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String toString() {

		return "Transaction ID: " + this.getIdTransaction() +"\n"+ "Total to pay: " + total+"\n";
	}
}
