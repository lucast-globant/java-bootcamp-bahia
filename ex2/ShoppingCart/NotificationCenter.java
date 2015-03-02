package ex2.ShoppingCart;

import java.util.Observable;
import java.util.Observer;

public class NotificationCenter implements Observer {
	Observable obs;
	EmailNotificationService admin;

	public NotificationCenter(Observable observable) {
		this.obs = observable;
		obs.addObserver(this);
		admin = EmailNotificationService.getInstance();
	}

	public void update(Observable arg0, Object arg1) {
		admin.receiveMessages((String) arg1);
	}

	public String toString() {
		return admin.toString();
	}

	public EmailNotificationService getAdmin() {
		return admin;
	}

	public void setAdmin(EmailNotificationService admin) {
		this.admin = admin;
	}

}
