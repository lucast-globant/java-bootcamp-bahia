package topic_1;

public interface MailSubject {
	
	public void attach (MailObserver observer);
	public void detach (MailObserver observer);
	public void doNotify (String message);
	
}
