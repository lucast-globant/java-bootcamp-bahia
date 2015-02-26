package topic1.mailist;

public class Notification {

	private String subject;
	private String bodyMessage;
	
	public Notification(String subject, String bodyMessage) {
		this.subject = subject;
		this.bodyMessage = bodyMessage;
	}

	public String getSubject() {
		return subject;
	}

	public String getBodyMessage() {
		return bodyMessage;
	}
	
}
