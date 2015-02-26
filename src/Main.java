import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Main{	

	public static void main(String[] args) {
		
		//TESTING CLASSES
					
		//VARIABLES DECLARATION
		int transactionCounter; 								
		ItemsStore itemsStore;		
		ShoppingCart cart;
		PaymentStrategy creditCard, paypal, cash;
		Offer offer1, offer2;
		List<Item> itemsOffer1, itemsOffer2;
		List<Offer> offersListOffer;
		MailList mailList;
		Calendar calendar;		

		
		//INICIALIZATION
		mailList=new MailList();
		itemsStore= new ItemsStore(mailList);
		cart = new ShoppingCart(itemsStore,mailList);
		transactionCounter=0;		
		calendar = Calendar.getInstance();
		
		//New items
		Item item1 = new Item("0001",10,mailList);
		Item item2 = new Item("0002",20,mailList);
		Item item3 = new Item("0003",5,mailList);
		Item item4 = new Item("0004",8,mailList);
		
		//Upload items to the itemsStore
		itemsStore.addItem(item1);
		itemsStore.addItem(item2);
		itemsStore.addItem(item3);
		itemsStore.addItem(item4);
		
		//Show items
		System.out.println("Store items:");
		System.out.println("");
		itemsStore.showItems();		
		
		//Add items to shopping cart and notify
		cart.addItem(item1);
		mailList.addNotification(new Notification("Martin",calendar.getTime(),item1.getName()+" has been added"));
		cart.addItem(item2);
		mailList.addNotification(new Notification("Martin",calendar.getTime(),item2.getName()+" has been added"));
		
			
		//Pay by credit card
		transactionCounter++;		
		creditCard =new CreditCardStrategy("Martin", "0123456789");
		System.out.println("");
		System.out.println(creditCard.getType());		
		cart.buy(creditCard, transactionCounter, mailList);
		
		//Pay by paypal
		transactionCounter++;
		paypal = new PaypalStrategy("mr_7300@example.com", "martin");
		System.out.println("");
		System.out.println(paypal.getType());
		cart.buy(paypal, transactionCounter, mailList);
		
		//Pay by cash
		transactionCounter++;
		cash=new CashStrategy();
		System.out.println("");
		System.out.println(cash.getType());
		cart.buy(cash, transactionCounter, mailList);
		
		
		//CREATION OF THE FIRST OFFER
		
		//Create list of items
		itemsOffer1=new ArrayList<Item>();
		itemsOffer1.add(item1);
		itemsOffer1.add(item2);
		itemsOffer1.add(item2);		
		
		//Create the offer
		offer1=new Offer();
		offer1.setItems(itemsOffer1);
		offer1.setName("Offer N. 1");
		offer1.setPrice(40);
		
		//Show offer
		System.out.println("");
		offer1.show();
		
		//Add offer in shopping cart
		cart.addOffer(offer1);
		mailList.addNotification(new Notification("Martin",calendar.getTime(),offer1.getName()+" has been added"));
		
		//CREATION OF THE SECOND OFFER
		
		//Create list of items
		itemsOffer2=new ArrayList<Item>();
		itemsOffer2.add(item3);
		itemsOffer2.add(item3);
		itemsOffer2.add(item3);		
		
		//Create list of offers
		offersListOffer=new ArrayList<Offer>();
		offersListOffer.add(offer1);

		//Create the offer
		offer2=new Offer(itemsOffer2,offersListOffer,50, "Offer N. 2");
		
		
		//Show offer
		System.out.println("");
		offer2.show();

		//Change item price
		item1.changPrice(11);
		
		//Show notifications
		System.out.println("");
		System.out.println("Notifications:");
		mailList.showNotification();
		

		//Show cart shopping items
		System.out.println("");
		System.out.println("Shopping cart items:");
		System.out.println("");
		cart.showItems();	
		
	}

}