package key_five;

import java.util.LinkedList;

public class OfferItems implements ItemElement {

	private LinkedList<ItemElement> items;
	private String offerName;

	public OfferItems(String offerName) {
		items = new LinkedList<ItemElement>();
		this.offerName = offerName;
	}

	public void addItem(ItemElement item) {
		items.add(item);
	}

	// The price of an offer is 20% less of the total price
	public float getPrice() {
		float sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.getPrice();
		}
		sum = (float) (sum - (sum * 0.2));
		return sum;
	}

	public String toString() {
		String toR = "OFFER: " + offerName + " $" + getPrice() + "\n";
		for (ItemElement item : items) {
			toR += "\t" + item.toString() + "\n";
		}
		return toR;
	}
}
