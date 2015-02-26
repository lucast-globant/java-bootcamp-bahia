package key_two;

import static org.junit.Assert.*;

import org.junit.Test;

public class TddTesting {

	private ShoppingService service = ShoppingServiceFactory.getLocalService();

	@Test
	public void addItemToShopping() {
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		service.deleteItemFromStock(item);
	}

	@Test
	public void deleteItemFromShopping() {
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		service.deleteItemFromStock(item);
	}

	@Test
	public void isDeletedItemFromShopping() {
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		service.deleteItemFromStock(item);
		assertEquals("", service.getStockAsString());
	}

	@Test
	public void isAddedToCart() {
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		ShoppingCart cart = service.createBuyingCart();
		cart.addItem(item);
		assertEquals(1, cart.getCantItems());
		service.deleteItemFromStock(item);
	}
	
	@Test
	public void testCantItemsInCart() {
		ItemElement item = new Mouse();
		service.addItemToStock(item);
		ShoppingCart cart = service.createBuyingCart();
		cart.addItem(item);
		assertEquals(1, cart.getCantItems());
	}
	
	@Test
	public void testPayItems() {
		ItemElement item = new Mouse();
		ItemElement item2 = new Mouse();
		service.addItemToStock(item);
		ShoppingCart cart = service.createBuyingCart();
		cart.addItem(item);
		cart.addItem(item2);
		assertEquals(2, cart.getCantItems());
		cart.pay(new PayPalStrategy("asd", "asd"));
		service.deleteItemFromStock(item);
		service.deleteItemFromStock(item2);
	}
	
	@Test
	public void testAddManagerForNotify() {
		service.addManagerToNotify(new Manager("Pedro"));
		ItemElement item = new Mouse();
		ItemElement item2 = new Mouse();
		service.addItemToStock(item);
		ShoppingCart cart = service.createBuyingCart();
		cart.addItem(item);
		cart.addItem(item2);
		assertEquals(2, cart.getCantItems());
		cart.pay(new PayPalStrategy("asd", "asd"));
		service.deleteItemFromStock(item);
		service.deleteItemFromStock(item2);
	}
	
}
