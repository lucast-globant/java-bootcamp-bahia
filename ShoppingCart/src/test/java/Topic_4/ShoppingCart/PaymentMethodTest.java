package Topic_4.ShoppingCart;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Topic_4.ShoppingCart.Items.Item;
import Topic_4.ShoppingCart.Items.Product;
import Topic_4.ShoppingCart.PaymentMethod.Cash;
import Topic_4.ShoppingCart.PaymentMethod.CreditCard;
import Topic_4.ShoppingCart.PaymentMethod.PaymentMethod;
import Topic_4.ShoppingCart.PaymentMethod.Paypal;

public class PaymentMethodTest {

	@Test
	public void CreditCardTest() {
		PaymentMethod payment = new CreditCard(1, "name");
		assertEquals("Payment by credit card.", payment.toString());
		List<Item> items = new ArrayList<Item>();
		// 0 items
		float actual = payment.applyDiscount(items, 0);
		assertEquals(0, actual, 0);
		// 1 item
		Item item1 = new Product("item", 100.00f);
		items.add(item1);
		actual = payment.applyDiscount(items, 100.00f);
		assertEquals(90.00f, actual, 0);
		// 2 items
		Item item2 = new Product("item2", 200.00f);
		items.add(item2);
		actual = payment.applyDiscount(items, 300.00f);
		assertEquals(270.00f, actual, 0);
	}

	@Test
	public void PaypalTest() {
		PaymentMethod payment = new Paypal("email", "pass");
		assertEquals("Payment by Paypal.", payment.toString());
		List<Item> items = new ArrayList<Item>();
		// 0 items
		float actual = payment.applyDiscount(items, 0);
		assertEquals(0, actual, 0);
		// 1 item
		Item item1 = new Product("item", 100.00f);
		items.add(item1);
		actual = payment.applyDiscount(items, 100.00f);
		assertEquals(0, actual, 0);
		// 2 items
		Item item2 = new Product("item2", 200.00f);
		items.add(item2);
		actual = payment.applyDiscount(items, 300.00f);
		assertEquals(200.00f, actual, 0);
	}

	@Test
	public void CashTest() {
		PaymentMethod payment = new Cash();
		assertEquals("Payment by cash.", payment.toString());
		List<Item> items = new ArrayList<Item>();
		// 0 items
		float actual = payment.applyDiscount(items, 0);
		assertEquals(0, actual, 0);
		// 1 item
		Item item1 = new Product("item", 100.00f);
		items.add(item1);
		actual = payment.applyDiscount(items, 100.00f);
		assertEquals(10.00f, actual, 0);
		// 2 items
		Item item2 = new Product("item2", 200.00f);
		items.add(item2);
		actual = payment.applyDiscount(items, 300.00f);
		assertEquals(120.00f, actual, 0);
	}

}
