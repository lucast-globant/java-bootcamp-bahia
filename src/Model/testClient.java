package Model;

import API.UserService;
import Model.paymentMethods.Cash;
import Model.paymentMethods.CreditCard;
import Model.paymentMethods.PaypalAccount;



public class testClient {

	public static void main(String[] args) {
		
		EcommerceService web=new EcommerceService(DataConnection.retrieveOffers());
		
		web.listItems();
		web.listOffers();
		
		CustomerAccount newCustomer1=new CustomerAccount("jordan", new CreditCard("jordan", 12, "100.00"),
				new PaypalAccount("jordan", "123", "", "100.00"), new Cash("100.00"));
		
		newCustomer1.getCart().add(web.searchProduct("Oferta del Bootcamp"), 1);
		
		newCustomer1.getCart().checkout(newCustomer1.getPaypalAccount());
		Transaction t = newCustomer1.getCart().checkout(newCustomer1.getCash());
		
		System.out.println("last transaction done:"+t.getId()+ " total: "+ t.getTotal());
	}
	
	

}
