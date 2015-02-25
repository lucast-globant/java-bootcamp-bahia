package key_two;

public class ShoppingServiceImplementation implements ShoppingService {

	private Shopping theShopping;

	protected ShoppingServiceImplementation() {
		theShopping = new Shopping();
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
		return new ShoppingCart(theShopping);
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

}
