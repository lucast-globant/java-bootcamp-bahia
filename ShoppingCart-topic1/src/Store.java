import java.util.ArrayList;
import java.util.Iterator;

public class Store {

	private ArrayList<Item> items;

	public Store() {
		items = new ArrayList<Item>();
	}

	public void addProduct(Product product) {
		items.add(product);
		MailList.getInstance().notify(
				"A new product was added to the stock, Name: " + product.getName() + " Code: " + product.getCode() + ".");
	}

	public void addOffer(Offer offer) {
		items.add(offer);
		MailList.getInstance().notify("A new offer was added to the stock, Name: " + offer.getName() + " Code: " + offer.getCode() + ".");
	}

	public void changePrice(int code, double price) {
		boolean stop = false;
		Item it;
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext() && !stop) {
			it = iterator.next();
			if (it.getCode() == code) {
				it.setValue(price);
				stop = true;
			}
		}
		MailList.getInstance().notify("The price of product with code: " + code + " was changed to: $" + price);
	}
}
