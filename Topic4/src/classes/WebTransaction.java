package classes;

import interfaces.Item;
import interfaces.PaymentStrategy;
import interfaces.Transaction;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class WebTransaction implements Transaction {

	private int id;
	private List<Item> items;
	private PaymentStrategy paymentStrategy;
	private double value;
	private Calendar date;

	public WebTransaction(List<Item> items, PaymentStrategy ps) {
		id = Counter.getInstance().nextValue();
		this.items = items;
		paymentStrategy = ps;
		date = new GregorianCalendar();
	}

	public int getID() {
		return id;
	}

	public List<Item> getItems() {
		return items;
	}

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public double getValue() {
		return value;
	}

	public Calendar getDate() {
		return date;
	}

	public void execute() {
		value = paymentStrategy.pay(items);
		System.out.println("-----End of transaction ID: " + id + "-----");
		System.out.println();
		MailList.getInstance().notify("New transaction ID " + id + ".");
	}
}
