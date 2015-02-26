package key_two;

public class ShoppingServiceJmsClient implements ShoppingService {

	private ShoppingService jmsObject;

	public ShoppingServiceJmsClient() {
		// jmsObject = code to get the reference to Service A from the jms call
	}

	@Override
	public void addItemToStock(ItemElement item) {
		jmsObject.addItemToStock(item);
	}

	@Override
	public void deleteItemFromStock(ItemElement item) {
		jmsObject.deleteItemFromStock(item);
	}

	@Override
	public void createOffer(OfferItems offer) {
		jmsObject.createOffer(offer);
	}

	@Override
	public void deleteOffer(OfferItems offer) {
		jmsObject.deleteOffer(offer);
	}

	@Override
	public ShoppingCart createBuyingCart() {
		return jmsObject.createBuyingCart();
	}

	@Override
	public String getStockAsString() {
		return jmsObject.getStockAsString();
	}
	
	@Override
	public void addManagerToNotify(NotificationObserver notificationObserver) {
		jmsObject.addManagerToNotify(notificationObserver);
	}
}
