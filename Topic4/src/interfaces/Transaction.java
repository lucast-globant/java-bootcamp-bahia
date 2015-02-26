package interfaces;

import java.util.Calendar;
import java.util.List;

public interface Transaction {

	public int getID();

	public List<Item> getItems();

	public PaymentStrategy getPaymentStrategy();

	public double getValue();

	public Calendar getDate();

	public void execute();
}
