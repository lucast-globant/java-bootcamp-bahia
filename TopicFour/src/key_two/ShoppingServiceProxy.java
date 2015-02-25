package key_two;

public class ShoppingServiceProxy implements ShoppingService {

	private ShoppingService implementation;

	protected ShoppingServiceProxy(ShoppingService imp) {
		this.implementation = imp;
	}

	@Override
	public void addItemToStock(ItemElement item) {
		implementation.addItemToStock(item);
	}

	@Override
	public void deleteItemFromStock(ItemElement item) {
		implementation.deleteItemFromStock(item);
	}

	@Override
	public void createOffer(OfferItems offer) {
		implementation.createOffer(offer);
	}

	@Override
	public void deleteOffer(OfferItems offer) {
		implementation.deleteOffer(offer);
	}

	@Override
	public ShoppingCart createBuyingCart() {
		return implementation.createBuyingCart();
	}

	@Override
	public String getStockAsString() {
		return implementation.getStockAsString();
	}

}
