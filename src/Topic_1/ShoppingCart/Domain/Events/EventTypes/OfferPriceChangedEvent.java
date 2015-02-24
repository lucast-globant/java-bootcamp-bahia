package Topic_1.ShoppingCart.Domain.Events.EventTypes;

import Topic_1.ShoppingCart.Domain.Entities.Offer;
import Topic_1.ShoppingCart.Domain.Events.Event;

public class OfferPriceChangedEvent extends Event {

	Offer offer;

	public OfferPriceChangedEvent(Offer offer) {
		this.offer = offer;
	}

	@Override public String getDescription() {
		return "[" + this.date + "]\nOffer price changed:\n" + offer.toString();
	}
}
