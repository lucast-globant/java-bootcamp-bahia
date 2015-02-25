import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;


public class UnitTestShoppingCart {

	@Test
	public void addItems() {
		
		
        
		Calendar calendar;
		Service cart;
		ItemsStore itemsStore;
		MailList mailList;
		mailList=new MailList();
		itemsStore= new ItemsStore(mailList);
		calendar = Calendar.getInstance();
		cart = ServiceFactory.getLocalService(itemsStore);
		
		//New items
		Item item1 = new Item("0001",10,mailList);
		Item item2 = new Item("0002",20,mailList);
		
		itemsStore.addItem(item1);
		itemsStore.addItem(item2);
		
		//Add items to shopping cart and notify
		cart.addItem(item1);
		mailList.addNotification(new Notification("Martin",calendar.getTime(),item1.getName()+" has been added"));
		cart.addItem(item2);
		mailList.addNotification(new Notification("Martin",calendar.getTime(),item2.getName()+" has been added"));
		assertEquals("0001", cart.getItem(0).getName());
		
	}

	@Test
	public void buy() {
		double DELTA = 1e-15;
		PaymentStrategy creditCard,paypal,cash;
		int transactionCounter=0;
		Calendar calendar;
		Service cart;
		ItemsStore itemsStore;
		MailList mailList;
		mailList=new MailList();
		itemsStore= new ItemsStore(mailList);
		cart = ServiceFactory.getLocalService(itemsStore);
		calendar = Calendar.getInstance();
		
		//New items
		Item item1 = new Item("0001",10,mailList);
		Item item2 = new Item("0002",20,mailList);
		
		itemsStore.addItem(item1);
		itemsStore.addItem(item2);
		
		//Add items to shopping cart and notify
		cart.addItem(item1);
		mailList.addNotification(new Notification("Martin",calendar.getTime(),item1.getName()+" has been added"));
		cart.addItem(item2);
		mailList.addNotification(new Notification("Martin",calendar.getTime(),item2.getName()+" has been added"));
		
		
		//Pay by credit card
		transactionCounter++;		
		creditCard =new CreditCardStrategy("Martin", "0123456789",mailList);
		System.out.println("");
		System.out.println(creditCard.getType());		
		assertEquals(27.0, cart.buy(creditCard, transactionCounter),DELTA);
		
		//Pay by paypal
		transactionCounter++;
		paypal = new PaypalStrategy("mr_7300@example.com", "martin",mailList);
		System.out.println("");
		System.out.println(paypal.getType());
		assertEquals(20.0, cart.buy(paypal, transactionCounter),DELTA);
		
		//Pay by cash
		transactionCounter++;
		cash=new CashStrategy(mailList);
		System.out.println("");
		System.out.println(cash.getType());
		assertEquals(12.0, cart.buy(cash, transactionCounter),DELTA);
		
	}
}
