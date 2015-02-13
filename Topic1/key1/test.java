package Topic1.key1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import Topic1.key1.EcommerceWebPage.payMethod;


public class test {

	public static void main(String[] args) {
		
		EcommerceWebPage web=new EcommerceWebPage(DataConnection.retrieveOffers());
		
		web.listItems();
		web.listOffers();
		
		Customer newCustomer1=new Customer("jordan", new CreditCard("jordan", 12, "100.00"),
				new PaypalAccount("jordan", "123", "", "100.00"), "100.00");
		

		
		newCustomer1.addProduct(web.searchProduct("Oferta del Bootcamp"), 1);
		web.checkout(payMethod.CASH, newCustomer1);
		
		
		web.checkout(payMethod.CASH, newCustomer1);
		
		
	}
	
	

}
