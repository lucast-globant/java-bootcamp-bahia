package topic_1;

public class EmailNotificationService implements MailObserver {
	
	private String mail;

	public EmailNotificationService(String mail) {
		this.mail = mail;
	}

	@Override
	public void update(String message) {
		System.out.println("Mail sent to "+ mail + "\n" + message);
	}

}
