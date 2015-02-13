package Topic1.key6;

import javax.security.auth.Subject;



public class testClient {

	public static void main(String[] args) {
		MailingList ml=new MailingList();
		IObserver ob=new Manager();
		
		ml.attach(ob);
		ml.setState(new Notification(Notification.PRICE_CHANGED));
		ml.setState(new Notification(Notification.TRANSACTION_DONE));
		
	}

}
