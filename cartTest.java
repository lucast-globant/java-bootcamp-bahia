package topic4;

import static org.junit.Assert.*;

import org.junit.Test;

import topic1.*;
import topic1.mailist.Mailist;
import topic1.offer.MultiOffer;
import topic1.offer.Offer;
import topic1.offer.SingleOffer;
import topic1.payment.CashPayment;
import topic1.payment.CreditCardPayment;
import topic1.payment.PaypalPayment;

public class cartTest {

	@Test
	public void Test() {	

		String emailManager = "managermarket@mail.com";
		Mailist managerNotifications = new Mailist (emailManager);
		Counter paymentsCounter = new Counter();
		ShoppingCart cart = new TDDCart (paymentsCounter);
		Offer offer1 = new SingleOffer ("Single offer");
		Offer offer2 = new MultiOffer ("Multi offer");
		
		assertEquals ("Single offer",offer1.getName());
		assertEquals ("Multi offer",offer2.getName());
		
		Item p1 = new Item (1,"Pen",10.4);
		Item p2 = new Item (2,"Pencil",4.6);
		Item p3 = new Item (3,"Rubber",3.5);
		Item p4 = new Item (4,"Block A4",22.5);
				
		assertEquals (1,p1.getCod());
		assertEquals ("Pen",p1.getDescription());
		assertEquals ("10.4",""+p1.getPrice());
		
		assertEquals ("For: managermarket@mail.com\nContent mail list: \nno notifications.",managerNotifications.toString());

		managerNotifications.addNotification(cart.addItem(p1));	
		
		assertEquals ("For: managermarket@mail.com\nContent mail list: \nSubject: Price changed\nBody Message: Content cart: \nCod 1Item Pen - Price 10.4\n\n",managerNotifications.toString());
		
		managerNotifications.addNotification(cart.addItem(p2));	
		managerNotifications.addNotification(cart.addItem(p3));
		managerNotifications.addNotification(cart.addItem(p4));	
		
		assertEquals ("Item Pen ...... Price $10.4\nItem Pencil ...... Price $4.6\n"
				+ "Item Rubber ...... Price $3.5\nItem Block A4 ...... Price $22.5\n",cart.showItems());

		cart.pay(new CreditCardPayment ("Victoria","1234123412341234"));
		cart.pay(new PaypalPayment ("vicky","12345678"));
		cart.pay(new CashPayment ());
		
		managerNotifications.addNotification(p1.setPrice(9.40));
		assertEquals ("Price changed",p1.setPrice(9.40).getSubject());
		
		managerNotifications.addNotification(((SingleOffer)offer1).addItem(p1));
		assertEquals ("New offer is added",((SingleOffer)offer1).addItem(p1).getSubject());
		
	}
}
