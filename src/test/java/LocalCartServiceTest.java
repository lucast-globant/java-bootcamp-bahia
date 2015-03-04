package test.java;

import static org.junit.Assert.*;
import model.ConcreteProduct;
import model.DataConnection;
import model.User;
import model.EcommerceService;
import model.Product;
import model.Transaction;
import model.servicesImpl.LocalCartService;
import model.servicesImpl.UserServiceFactory;

import org.junit.Test;

import api.CartService;
import api.UserService;


public class LocalCartServiceTest {

	
	@Test
	public void cartCheckoutTransactionDone() {
		
		
		EcommerceService web = new EcommerceService(DataConnection.retrieveOffers());
	
		User newCustomer1 = new User("jordan");
		
		CartService cs=new LocalCartService();
		cs.createCart(newCustomer1.getCart());
		cs.addItem("jordan", web.searchProduct("Oferta del Bootcamp"), 1);
		Transaction t = cs.checkout(newCustomer1.getPaypalAccount(), "jordan");
		
		assertNotEquals(0, t.getId());

	}

	@Test
	public void cartCleanEmptyCart() {

		EcommerceService web = new EcommerceService(DataConnection.retrieveOffers());
	
		User newCustomer1 = new User("jordan");
		CartService cs=new LocalCartService();
		cs.createCart(newCustomer1.getCart());
		cs.addItem("jordan", web.searchProduct("Oferta del Bootcamp"), 1);
		cs.cleanCart("jordan");
		
		assertEquals(true, cs.getCart("jordan").getItems().isEmpty());
	}

}
