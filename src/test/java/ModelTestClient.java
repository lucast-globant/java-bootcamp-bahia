package test.java;

import model.User;
import model.DataConnection;
import model.EcommerceService;
import model.Transaction;
import model.paymentMethods.Cash;
import model.paymentMethods.CreditCard;
import model.paymentMethods.PaypalAccount;



public class ModelTestClient {

	public static void main(String[] args) {
		
		EcommerceService web=new EcommerceService(DataConnection.retrieveOffers());
		
		web.listItems();
		web.listOffers();
		
		User newCustomer1=new User("jordan", new CreditCard("jordan", 12, "100.00"),
				new PaypalAccount("jordan", "123", "", "100.00"), new Cash("100.00"));
		
		newCustomer1.getCart().add(web.searchProduct("Oferta del Bootcamp"), 1);
		
		newCustomer1.getCart().checkout(newCustomer1.getPaypalAccount());
		Transaction t = newCustomer1.getCart().checkout(newCustomer1.getCash());
		
		System.out.println("last transaction done:"+t.getId()+ " total: "+ t.getTotal());
	}
	
	

}
