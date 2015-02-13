import java.util.ArrayList;
import java.util.List;

/* Test class that simulate a purchase of a costumer.
 * IF YOU WONT TO CHANGE PAY METHOD YOU NEED TO DESCOMMENT THE SECTION BELOW*/

public class TransactionTest {

	public static void main(String[] args) {

		/* Simulate items that the costumer its going to buy */

		ShoppingCart cart = new ShoppingCart();

		Item i1 = new Product(20, " Plate ", "1");
		Item i2 = new Product(10, " Fork ", "2");
		Item i3 = new Product(8, " Spoon ", "3");

		/* Add items to the cart */

		cart.addItem(i1);
		cart.addItem(i2);
		cart.addItem(i3);

		/* Simulate an offer of the same products */

		Item i4 = new Product(10, " Plate ", "1");
		Item i5 = new Product(5, " Fork ", "2");
		Item i6 = new Product(4, " Spoon ", "3");

		List<Item> offer = new ArrayList<Item>();

		offer.add(i4);
		offer.add(i5);
		offer.add(i6);
		Item i7 = new Offer(" Kitchen Offer", "4", offer);

		cart.addItem(i7);

		/* Show items at cart */

		System.out.println(cart.toString());

		/* Simulate purchase */

		Payment paymentMethod = null;

		/* 1. --- Credit Card ---- */

		// paymentMethod = new CredictCardPayment(" Francis UnderWood ",
		// "1245631", "126", "1978");

		/* 2. --- PayPal --- */

		// paymentMethod = new PayPalPayment("fUnderwood@houseofcards.gov",
		// "*****");

		/* 3. --- Cash --- */

		paymentMethod = new CashPayment();

		Transaction t = new Transaction(cart, paymentMethod);
		t.Purchase(paymentMethod);

	}

}
