package key_six;

public interface NotificationSubject {

	public void addObserver(NotificationObserver notificationObserver);

	public void removeObserver(NotificationObserver notificationObserver);

	public void doNotify();
}
