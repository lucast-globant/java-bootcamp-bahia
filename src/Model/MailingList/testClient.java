package Model.MailingList;



/**
 * @author Jordan
 * demo showing how to notify observers
 */
public class testClient {

	public static void main(String[] args) {
	
		IObserver ob=new EMailAccount();
		
		EmailSender.getInstance().attachToList(ob);
		EmailSender.getInstance().notifyToList("PRICE_CHANGED");
		EmailSender.getInstance().notifyToList("TRANSACTION_DONE");
		
	}

}
