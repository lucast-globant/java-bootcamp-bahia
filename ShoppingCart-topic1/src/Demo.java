import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Manager of the Store
		Manager manager = new MarketManager("Amilcar", "Infante");
		MailList.getInstance().addManager(manager);

		// Products to sale
		Item p1 = new Product("Iphone 6", 150, 300.00);
		Item p2 = new Product("Samsung S5", 151, 250.00);
		Item p3 = new Product("Moto X", 160, 150.00);
		Item p4 = new Product("LG G3", 161, 225.00);

		// Offers
		Offer of1 = new Offer("Offer 1", 500, 500.00);
		of1.addItem(p1);
		of1.addItem(p2);

		// Add the products and offers to the stock
		Store store = new Store();
		store.addProduct((Product) p1);
		store.addProduct((Product) p2);
		store.addProduct((Product) p3);
		store.addProduct((Product) p4);
		store.addOffer(of1);

		// The price of p3 was changed to 125.00
		store.changePrice(160, 125.00);

		System.out.println();

		// ShoppingCart buying of1 and products p3 and p4
		ShoppingCart sc1 = new ShoppingCart();
		sc1.addItem(of1);
		sc1.addItem(p3);
		sc1.addItem(p4);

		sc1.displayItems();

		paymentProccesing(sc1);
	}

	// This method is responsible for processing payment
	private static void paymentProccesing(ShoppingCart sc) {

		int option;

		// Choice of payment method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the payment method: ");
		System.out.println("1-Credit Card\t 2-Paypal\t 3-Cash");
		System.out.print("Option: ");
		option = scanner.nextInt();

		while (option < 1 || option > 3) {
			System.out.println();
			System.out.println("Wrong choice, please choose one of the following: ");
			System.out.println("1-Credit Card\t 2-Paypal\t 3-Cash");
			System.out.print("Option: ");
			option = scanner.nextInt();
		}

		System.out.println();
		scanner.close();

		PaymentStrategy ps = null;

		// Creation of payment method
		switch (option) {
		case 1: {
			ps = new CreditCardStrategy("Luciano", 1234);
			break;
		}
		case 2: {
			ps = new PaypalStrategy("luciano@yahoo.com", "1234");
			break;
		}
		case 3: {
			ps = new CashStrategy();
			break;
		}
		}

		// Payment
		sc.pay(ps);
	}

}
