/* This class control the transaction to given a unique ID*/

public class TransactionControler {

	private Transaction transaction;
	private int ID;

	public static Transaction createTransaction(int ID) {

		return new Transaction(ID);
	}
}
