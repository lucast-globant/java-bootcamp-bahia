package Topic_1.ShoppingCart.Domain.Events.EventTypes;

import Topic_1.ShoppingCart.Domain.Entities.Item;
import Topic_1.ShoppingCart.Domain.Events.Event;

public class NewItemAddedEvent extends Event {

	private Item item;

	public NewItemAddedEvent(Item item) {
		this.item = item;
	}

	public String getDescription() {
		return "[" + this.date + "]\nNew item added:\n" + item.toString();
	}
}
