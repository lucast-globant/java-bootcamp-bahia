package key_two;

import java.util.LinkedList;
import java.util.List;

public class OfferItems implements ItemElement {

	private List<ItemElement> items;
	private String offerName;
	private float priceFactor;

	public OfferItems(String offerName) {
		items = new LinkedList<ItemElement>();
		this.offerName = offerName;
		priceFactor = 1 / 10;
	}

	public void addItem(ItemElement item) {
		items.add(item);
	}

	public float getPrice() {
		float sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.getPrice();
		}
		sum = (float) (sum - (sum * priceFactor));
		return sum;
	}

	public String toString() {
		String toR = "OFFER: " + offerName + " $" + getPrice() + "\n";
		for (ItemElement item : items) {
			toR += "\t" + item.toString() + "\n";
		}
		return toR;
	}

	@Override
	public void changePrice(float newPrice) {
		this.priceFactor = newPrice;
		SingletonNotificationManager.getInstance().newNotification(
				"Offer " + offerName + " price changed");
	}
}
