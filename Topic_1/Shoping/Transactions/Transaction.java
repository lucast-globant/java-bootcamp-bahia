package Transactions;

import java.util.List;

import Items.Item;
import PaymentMethod.PaymentMethod;

public class Transaction {
	protected int number;
	protected PaymentMethod paymentm;
	protected List<Item> items;
	protected double total;

	public Transaction(PaymentMethod pa, List<Item> l, double pr) {
		number = TransactionNumber.getInstance().getTransactionNum();
		paymentm = pa;
		items = l;
		total = pr;
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

	public void setItems(List<Item> i) {
		items = i;
	}

	public double getTotal() {
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
