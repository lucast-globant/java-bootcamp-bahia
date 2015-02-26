package key_two;

public class ShoppingServiceImplementation implements ShoppingService {

	private SingletonShopping theShopping;

	protected ShoppingServiceImplementation() {
		theShopping = SingletonShopping.getInstance();
	};

	@Override
	public void addItemToStock(ItemElement item) {
		theShopping.addItem(item);
	}

	@Override
	public void deleteItemFromStock(ItemElement item) {
		theShopping.deleteItem(item);
	}

	@Override
	public ShoppingCart createBuyingCart() {
		return new ShoppingCart();
	}

	@Override
	public String getStockAsString() {
		return theShopping.getStockAsString();
	}

	@Override
	public void createOffer(OfferItems offer) {
		theShopping.addItem(offer);
	}

	@Override
	public void deleteOffer(OfferItems offer) {
		theShopping.deleteItem(offer);
	}

	@Override
	public void addManagerToNotify(NotificationObserver notificationObserver) {
		theShopping.addObserver(notificationObserver);
	}

}
