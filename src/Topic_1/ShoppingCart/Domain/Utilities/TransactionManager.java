package Topic_1.ShoppingCart.Domain.Utilities;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Manages the ID of the transactions
 */
public class TransactionManager {

	private static AtomicLong transactionCounter = new AtomicLong(0);

	public static long getNextId() {
		return transactionCounter.addAndGet(1);
	}

}
