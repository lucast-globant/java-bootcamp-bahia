package key_two;

public class ShoppingServiceWebServiceClient implements ShoppingService {

	private ShoppingService webService;

	public ShoppingServiceWebServiceClient() {
		// webService = code to get the reference to Service A from the
		// webservice call
	}

	@Override
	public void addItemToStock(ItemElement item) {
		webService.addItemToStock(item);
	}

	@Override
	public void deleteItemFromStock(ItemElement item) {
		webService.deleteItemFromStock(item);
	}

	@Override
	public void createOffer(OfferItems offer) {
		webService.createOffer(offer);
	}

	@Override
	public void deleteOffer(OfferItems offer) {
		webService.deleteOffer(offer);
	}

	@Override
	public ShoppingCart createBuyingCart() {
		return webService.createBuyingCart();
	}

	@Override
	public String getStockAsString() {
		return webService.getStockAsString();
	}
	
	@Override
	public void addManagerToNotify(NotificationObserver notificationObserver) {
		webService.addManagerToNotify(notificationObserver);
	}
}
