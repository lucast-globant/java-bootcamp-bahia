import java.util.ArrayList;

public interface PaymentStrategy {

	public double pay(ArrayList<Item> items);
}
