package Topic_4.ShoppingCart;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Topic_4.ShoppingCart.Items.Item;
import Topic_4.ShoppingCart.Items.Product;
import Topic_4.ShoppingCart.PaymentMethod.Cash;
import Topic_4.ShoppingCart.PaymentMethod.PaymentMethod;
import Topic_4.ShoppingCart.Transactions.Transaction;

public class TransactionTest {

	@Test
	public void TransactionNumbersTest() {
		PaymentMethod payment = new Cash();
		List<Item> items = new ArrayList<Item>();
		Item item1 = new Product("item1", 100.00f);
		items.add(item1);
		float total = payment.applyDiscount(items, 100.00f);
		// Transaction number = 1
		Transaction transaction = new Transaction(payment, items, total);
		int actual = transaction.getNumber();
		assertEquals(1, actual);
		// Transaction number = 2
		transaction = new Transaction(payment, items, total);
		actual = transaction.getNumber();
		assertEquals(2, actual);
		// Transaction number = 3
		transaction = new Transaction(payment, items, total);
		actual = transaction.getNumber();
		assertEquals(3, actual);
	}

}
