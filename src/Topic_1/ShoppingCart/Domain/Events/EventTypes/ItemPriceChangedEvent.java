package Topic_1.ShoppingCart.Domain.Events.EventTypes;

import Topic_1.ShoppingCart.Domain.Entities.Item;
import Topic_1.ShoppingCart.Domain.Events.Event;

public class ItemPriceChangedEvent extends Event {

	private Item item;

	public ItemPriceChangedEvent(Item item) {
		this.item = item;
	}

	@Override public String getDescription() {
		return "[" + this.date + "]\nItem price changed: " + item.toString();
	}
}
