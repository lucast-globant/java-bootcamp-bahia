package Transactions;

import java.util.List;

import Items.Item;
import PaymentMethod.PaymentMethod;

public class Transaction {
	protected int number;
	protected PaymentMethod paymentm;
	protected List<Item> items;
	protected float total;

	public Transaction(PaymentMethod paymentm, List<Item> items, float total) {
		number = TransactionNumber.getInstance().getTransactionNum();
		this.paymentm = paymentm;
		this.items = items;
		this.total = total;
	}

	public int getNumber() {
		return number;
	}

	public PaymentMethod getPaymentm() {
		return paymentm;
	}

	public List<Item> getItems() {
		return items;
	}

	public float getTotal() {
		return total;
	}

	public String toString() {
		String s = "";
		s += "Transaction number: " + number + "\n";
		s += "Payment Method: " + paymentm.toString() + "\n";
		s += "Total: $" + total;
		return s;
	}

}
