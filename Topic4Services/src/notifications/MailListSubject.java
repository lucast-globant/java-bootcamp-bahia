package notifications;


public interface MailListSubject {

	public void addObserver(MarketManagerObserver mmObserver);

	public void removeObserver(MarketManagerObserver mmObserver);

	public void notifyObservers();

}
