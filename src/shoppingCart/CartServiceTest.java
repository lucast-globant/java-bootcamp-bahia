package shoppingCart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CartServiceTest {
	@Before
	public void initialize() {
		Product.resetIDs();
	}

	@Test
	public void testAddProductsToCart() {
		String user = "user1";
		int noOfItems;
		IShoppingCartService service = new ShoppingCartService();
		service.createCart(user);
		service.addItem(user, 3, 4);
		service.addItem(user, 10, 1);
		service.addItem(user, 7, 2);
		noOfItems = service.getShoppingCart(user).numberOfItems();
		assertEquals(3, noOfItems);
	}

	@Test
	public void testAddAProductInNonExistingUserCart() {
		int quantityOfCarts;
		IShoppingCartService service = new ShoppingCartService();
		service.addItem("user1", 3, 3);
		quantityOfCarts = service.numberOfShoppingCarts();
		assertEquals(1, quantityOfCarts);
	}

	@Test
	public void testCreateACartTwiceForSameUser() {
		int quantityOfCarts;
		IShoppingCartService service = new ShoppingCartService();
		service.createCart("user1");
		service.createCart("user1");
		quantityOfCarts = service.numberOfShoppingCarts();
		assertEquals(1, quantityOfCarts);
	}

	@Test
	public void testAddProductsToDiffCarts() {
		String user1 = "user1";
		String user2 = "user2";
		int noOfItems;
		IShoppingCartService service = new ShoppingCartService();
		service.createCart(user1);
		service.addItem(user2, 5, 2);
		service.addItem(user2, 8, 1);
		service.addItem(user1, 3, 4);
		service.addItem(user1, 10, 1);
		service.addItem(user1, 7, 2);
		noOfItems = service.getShoppingCart(user2).numberOfItems();
		assertEquals(2, noOfItems);
	}

	@Test
	public void testRemoveAnExistingProduct() {
		String user = "user1";
		int noOfItems;
		IShoppingCartService service = new ShoppingCartService();
		service.createCart(user);
		service.addItem(user, 3, 4);
		service.addItem(user, 10, 1);
		service.addItem(user, 7, 2);
		service.removeItem(user, 10);
		noOfItems = service.getShoppingCart(user).numberOfItems();
		assertEquals(2, noOfItems);
	}

	@Test
	public void testRemoveANonExistingProduct() {
		String user = "user1";
		int noOfItems;
		IShoppingCartService service = new ShoppingCartService();
		service.createCart(user);
		service.addItem(user, 3, 4);
		service.addItem(user, 10, 1);
		service.addItem(user, 7, 2);
		service.removeItem(user, 11);
		noOfItems = service.getShoppingCart(user).numberOfItems();
		assertEquals(3, noOfItems);
	}

	@Test
	public void testPayAndCheckout() {
		String user1 = "user1";
		String user2 = "user2";
		int noOfTrans;
		IShoppingCartService service = new ShoppingCartService();
		service.createCart(user1);
		service.addItem(user2, 5, 2);
		service.addItem(user2, 8, 1);
		service.addItem(user1, 3, 4);
		service.addItem(user1, 10, 1);
		service.addItem(user1, 7, 2);

		CreditCardPayment payment = new CreditCardPayment("John",
				"1102 1548 1665 9912", service.getShoppingCart(user2), user2);
		
		service.payAndCheckout(payment);
		noOfTrans = service.numberOfTransactions();

		assertEquals(1, noOfTrans);
	}
	
	@Test
	public void testPayAndCheckoutThenUserCartIsEmpty() {
		String user1 = "user1";
		String user2 = "user2";
		int noOfItems;
		IShoppingCartService service = new ShoppingCartService();
		service.createCart(user1);
		service.addItem(user2, 5, 2);
		service.addItem(user2, 8, 1);
		service.addItem(user1, 3, 4);
		service.addItem(user1, 10, 1);
		service.addItem(user1, 7, 2);

		CreditCardPayment payment = new CreditCardPayment("John",
				"1102 1548 1665 9912", service.getShoppingCart(user2), user2);
		
		service.payAndCheckout(payment);
		noOfItems = service.getShoppingCart(user2).numberOfItems();

		assertEquals(0, noOfItems);
	}
}
