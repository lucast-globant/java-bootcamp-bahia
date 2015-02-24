package Topic_1.ShoppingCart;

import Topic_1.ShoppingCart.DataAccess.Repositories.ItemsRepo;
import Topic_1.ShoppingCart.DataAccess.Repositories.OffersRepo;
import Topic_1.ShoppingCart.Domain.Discounts.DiscountManager;
import Topic_1.ShoppingCart.Domain.Discounts.IDiscountManager;
import Topic_1.ShoppingCart.Domain.Entities.*;
import Topic_1.ShoppingCart.Domain.Events.NotificationLogger;
import Topic_1.ShoppingCart.Domain.PaymentMethods.CreditCardPayment;
import Topic_1.ShoppingCart.Domain.PaymentMethods.IPaymentMethod;
import Topic_1.ShoppingCart.Domain.Events.IEventLogger;
import Topic_1.ShoppingCart.Domain.Utilities.NotificationCenter;
import Topic_1.ShoppingCart.Domain.Utilities.UserManager;

import java.util.List;

public class Main {
	public static void main(String args[]) {

		// Simulate user login
		UserManager.login(new User("nico", "pass"));

		// Initialize repos, discount manager and event logger (To be replaced with DI)
		IEventLogger eventLogger = new NotificationLogger();
		ItemsRepo itemsRepo = initializeItemsRepo(eventLogger);
		OffersRepo offersRepo = initializeOffersRepo(eventLogger);
		IDiscountManager discountManager = new DiscountManager();

		// Setup payment method
		IPaymentMethod paymentMethod = new CreditCardPayment("email", "1348923984");
		//IPaymentMethod paymentMethod = new CashPayment();
		//IPaymentMethod paymentMethod = new PaypalPayment("email", "1348923984");

		// Modify first item price
		// (I don't know any ID, so I choose the first in this unconventional way just for testing)
		for (Item item : itemsRepo.all()) {
			item.setPrice(80);
			itemsRepo.save(item);
			break;
		}

		// Initialize test cart
		Cart cart = new Cart();

		// Add all available items to the cart
		cart.addItems(itemsRepo.all());
		cart.addItems(offersRepo.all());

		// Start payment transaction
		Transaction transaction = Transaction.createTransaction(
				cart,
				UserManager.getCurrentUser(),
				paymentMethod,
				discountManager,
				eventLogger
		);

		// Execute payment transaction
		Cart discountedCart = transaction.execute();

		// Print discounted cart
		System.out.println(discountedCart.toString());

		// Get and show notifications for current user
		List<Notification> notifications = NotificationCenter.getNotifications(UserManager.getBusinessManagerUser());

		printNotifications(notifications);
	}

	private static ItemsRepo initializeItemsRepo(IEventLogger eventLogger) {

		// Create items repository
		ItemsRepo itemsRepo = new ItemsRepo(eventLogger);

		// Create new items
		Item tv = new Item("LED TV", 6000.0);
		Item monitor = new Item("Monitor", 1255.0);

		// Add items to items repository
		itemsRepo.add(tv);
		itemsRepo.add(monitor);

		return itemsRepo;
	}

	private static OffersRepo initializeOffersRepo(IEventLogger eventLogger) {

		// Create repository
		OffersRepo offersRepo = new OffersRepo(eventLogger);

		// Create offer
		Item laptop = new Item("Laptop", 12055.0);
		Item mouse = new Item("Mouse", 155.0);

		Offer offer = new Offer("Laptop + Mouse", 12040.3);
		offer.addItem(laptop);
		offer.addItem(mouse);

		// Add offer to the offers repository
		offersRepo.add(offer);

		return offersRepo;
	}

	private static void printNotifications(List<Notification> notifications) {
		String title = String.format("\nNotifications for user %s", UserManager.getBusinessManagerUser().getUsername());

		System.out.println(title);

		System.out.println("===============================================");

		for (Notification notification : notifications) {
			System.out.println(notification);
		}
	}

}
