package Topic_1.ShoppingCart.Domain.Events.EventTypes;

import Topic_1.ShoppingCart.Domain.Entities.Offer;
import Topic_1.ShoppingCart.Domain.Events.Event;

public class NewOfferAddedEvent extends Event {

	private Offer item;

	public NewOfferAddedEvent(Offer offer) {
		this.item = offer;
	}

	public String getDescription() {
		return "[" + this.date + "]\nNew offer added:\n" + item.toString();
	}
}
