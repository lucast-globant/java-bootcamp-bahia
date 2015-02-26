package key_two;

public interface ShoppingService {

	public void addItemToStock(ItemElement item);

	public void deleteItemFromStock(ItemElement item);

	public void createOffer(OfferItems offer);

	public void deleteOffer(OfferItems offer);

	public ShoppingCart createBuyingCart();

	public String getStockAsString();
	
	public void addManagerToNotify(NotificationObserver notificationObserver);
}
