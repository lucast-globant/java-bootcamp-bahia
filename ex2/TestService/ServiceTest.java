package ex2.TestService;

import static org.junit.Assert.*;

import org.junit.Test;

import ex2.Payments.Cash;
import ex2.Payments.CreditCard;
import ex2.Payments.Payment;
import ex2.Payments.Paypal;
import ex2.Services.CartServiceProxy;
import ex2.ShoppingCart.Item;
import ex2.ShoppingCart.Product;
import ex2.ShoppingCart.ShoppingCart;
import ex2.ShoppingCart.Transaction;

public class ServiceTest {

	@Test
	public void test_creation() {
		CartServiceProxy cart = new CartServiceProxy(new ShoppingCart());
		assertEquals(true, cart != null);
	}
	@Test
	public void test_add_item() {
		CartServiceProxy cart = new CartServiceProxy(new ShoppingCart());
		Item item = new Product ("Coffler Block",10);
		cart.addItem(item);
		assertEquals(item,cart.getItems().get(0));
		
	}
	@Test
	public void test_rmv_item() {
		CartServiceProxy cart = new CartServiceProxy(new ShoppingCart());
		Item item = new Product ("Coffler Block",10);
		cart.addItem(item);
		cart.removeItem(item);
		assertEquals(true,cart.getItems().isEmpty());
		
	}
	@Test
	public void test_subtotal() {
		CartServiceProxy cart = new CartServiceProxy(new ShoppingCart());
		Item item = new Product ("Coffler Block",10);
		cart.addItem(item);
		assertEquals((int)item.getPrice(),(int)cart.getSubtotal());
		
	}
	@Test
	public void test_checkOut_Credit() {
		CartServiceProxy cart = new CartServiceProxy(new ShoppingCart());
		Payment payment=(new CreditCard(4444	, "Francisco Cuenca"));
		Item item = new Product ("Coffler Block",100);
		cart.addItem(item);
		Transaction t=cart.checkOut(payment);
		
		assertEquals(90,(int)t.getTotal());
		
	}
	@Test
	public void test_checkOut_Paypal() {
		CartServiceProxy cart = new CartServiceProxy(new ShoppingCart());
		Payment payment=(new Paypal("frcuenca4@gmail.com","1234"));
		Item item1 = new Product ("Coffler Block",100);
		Item item2 = new Product ("Turron",1);
		cart.addItem(item1);
		cart.addItem(item2);
		Transaction t=cart.checkOut(payment);
		assertEquals(100,(int)t.getTotal());
		
	}
	@Test
	public void test_checkOut_Cash() {
		CartServiceProxy cart = new CartServiceProxy(new ShoppingCart());
		Payment payment=(new Cash());
		Item item1 = new Product ("Coffler Block",100);
		cart.addItem(item1);
		Transaction t=cart.checkOut(payment);
		assertEquals(10,(int)t.getTotal());
		
	}
	
	

}
