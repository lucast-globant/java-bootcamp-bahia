import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Transaction {

	private int ID;
	private ArrayList<Item> items;
	private PaymentStrategy paymentStrategy;
	private double value;
	private Calendar date;

	public Transaction(ArrayList<Item> items, PaymentStrategy ps) {
		ID = Counter.getInstace().nextValue();
		this.items = items;
		paymentStrategy = ps;
		date = new GregorianCalendar();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setDate(Calendar d) {
		date = d;
	}

	public Calendar getDate() {
		return date;
	}

	public void execute() {
		value = paymentStrategy.pay(items);
		System.out.println("-----End of transaction ID: " + ID + "-----");
		System.out.println();
		MailList.getInstance().notify("New transaction ID " + ID + ".");
	}
}
