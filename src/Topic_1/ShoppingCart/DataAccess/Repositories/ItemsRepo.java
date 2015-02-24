package Topic_1.ShoppingCart.DataAccess.Repositories;

import Topic_1.ShoppingCart.Domain.Entities.Item;
import Topic_1.ShoppingCart.Domain.Events.EventTypes.ItemPriceChangedEvent;
import Topic_1.ShoppingCart.Domain.Events.IEventLogger;
import Topic_1.ShoppingCart.Domain.Events.EventTypes.NewItemAddedEvent;

public class ItemsRepo extends GenericRepository<Item> implements IRepository<Item> {

	public ItemsRepo(IEventLogger eventLogger) {
		super(eventLogger);
	}

	@Override public void add(Item element) {
		elements.put(element.getId(), element);
		eventLogger.log(new NewItemAddedEvent(element));
	}

	@Override public void save(Item element) {
		elements.put(element.getId(), element);

		if (element.isDirtyPrice())
			eventLogger.log(new ItemPriceChangedEvent(element));
	}
}
