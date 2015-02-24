package Topic_1.ShoppingCart.DataAccess.Repositories;

import Topic_1.ShoppingCart.Domain.Entities.Offer;
import Topic_1.ShoppingCart.Domain.Events.EventTypes.OfferPriceChangedEvent;
import Topic_1.ShoppingCart.Domain.Events.IEventLogger;
import Topic_1.ShoppingCart.Domain.Events.EventTypes.NewOfferAddedEvent;

public class OffersRepo extends GenericRepository<Offer> implements IRepository<Offer> {

	public OffersRepo(IEventLogger eventLogger) {
		super(eventLogger);
	}

	@Override public void add(Offer element) {
		elements.put(element.getId(), element);
		eventLogger.log(new NewOfferAddedEvent(element));
	}

	@Override public void save(Offer element) {
		elements.put(element.getId(), element);

		if (element.isDirtyPrice())
			eventLogger.log(new OfferPriceChangedEvent(element));
	}
}
