package Topic1.key6;



public class testClient {

	public static void main(String[] args) {
		MailingList ml=new MailingList();
		IObserver ob=new Manager();
		
		ml.attach(ob);
		ml.setNotification(new Notification(Notification.PRICE_CHANGED));
		ml.setNotification(new Notification(Notification.TRANSACTION_DONE));
		
	}

}
