package topic1.notifications;

public interface Subject {
	
	public void addObserver(Observer o);

	public void removeObserver(Observer o);

	public void doNotify (Mail mail);
}
