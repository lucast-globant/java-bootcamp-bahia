package test;

import static org.junit.Assert.*;

import org.junit.Test;

import API.UserService;
import Model.ConcreteProduct;
import Model.CustomerAccount;
import Model.CustomerService;
import Model.EcommerceService;
import Model.Product;
import Model.Transaction;

public class _CartService {

	@Test
	public void cart_checkout_TransactionDone() {

		EcommerceService web = new EcommerceService();
		Product p = new ConcreteProduct();
		web.addProduct(p);

		CustomerService newCustomer1 = new CustomerAccount("jordan");
		newCustomer1.getCart().add(web.searchProduct(""), 1);
		Transaction t = newCustomer1.getCart().checkout(newCustomer1.getPaypalAccount());

		assertNotEquals(0, t.getId());

	}

	@Test
	public void cart_clean_emptyCart() {

		EcommerceService web = new EcommerceService();
		Product p = new ConcreteProduct();
		web.addProduct(p);

		CustomerService newCustomer1 = new CustomerAccount("jordan");
		newCustomer1.getCart().add(web.searchProduct(""), 1);
		newCustomer1.getCart().cleanCart();

		assertEquals(true, newCustomer1.getCart().getItems().isEmpty());
	}

}
