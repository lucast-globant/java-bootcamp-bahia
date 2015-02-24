package Topic_1.ShoppingCart.Domain.Events.EventTypes;

import Topic_1.ShoppingCart.Domain.Events.Event;
import Topic_1.ShoppingCart.Domain.Entities.Transaction;

public class NewTransactionMadeEvent extends Event {

	private Transaction transaction;

	public NewTransactionMadeEvent(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override public String getDescription() {
		// TODO: Add more information to the notification
		return String.format("[%s] New transaction made", this.date);
	}
}
