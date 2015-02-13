import java.util.ArrayList;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private int creditNumber;

	public CreditCardStrategy(String n, int cn) {
		name = n;
		creditNumber = cn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

	public double pay(ArrayList<Item> items) {
		double total = 0;
		for (Item p : items) {
			total += p.getValue();
		}
		System.out.println("Cost of the buy: $" + total + ".");
		total *= 0.9;
		System.out.println("You have a discount of 10% for paying by Credit Card.");
		System.out.println("Final cost: $" + total + ".");
		return total;
	}
}
