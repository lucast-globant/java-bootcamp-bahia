package ex2.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class EmailNotificationService {
	private static EmailNotificationService instance= new EmailNotificationService();
	private List<String> mailList;
	private Queue<String> messages;

	private EmailNotificationService() {
		mailList = new ArrayList<String>();
		messages = new LinkedBlockingDeque<String>();
	}

	public static EmailNotificationService getInstance() {
		return instance;
	}

	public void receiveMessages(String message) {
		this.messages.add(message);
	}

	public String toString() {
		return "-----NOTIFICATION CENTER-----\n" + "emails:" + mailList.toString() + "\n Messages:\n" + messages.toString();

	}

	public void addMail(String email) {
		this.mailList.add(email);
	}

	public void removeMail(String email) {
		this.mailList.remove(email);
	}
}
