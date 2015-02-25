package Topic_4.ShoppingCart.Transactions;

import java.util.concurrent.atomic.AtomicInteger;

public class TransactionNumber {
	private static TransactionNumber transaction = null;
	private static final AtomicInteger number = new AtomicInteger(0);

	private TransactionNumber() {
	}

	public static TransactionNumber getInstance() {
		if (transaction == null)
			return new TransactionNumber();
		return transaction;
	}

	public int getTransactionNum() {
		return number.incrementAndGet();
	}
}
