package Transactions;

public class TransactionNumber {
	private static TransactionNumber transaction = null;
	private static int number = 1;

	private TransactionNumber() {
	}

	public static TransactionNumber getInstance() {
		if (transaction == null)
			return new TransactionNumber();
		return transaction;
	}

	public int getTransactionNum() {
		return number++;
	}
}
