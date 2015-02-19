package Topic1.key6;

import java.util.ArrayList;
import java.util.List;


public class MailingList {
	
	private List<IObserver> observerList= new ArrayList<IObserver>();
	private Notification notification;
	
	public Notification getNotification() {
		return notification;
	}
	
	public void setNotification(Notification notify) {
		this.notification = notify;
		stateChanged();
	}
	
	private void stateChanged() {
		for (IObserver iObserver : observerList) {
			iObserver.update(getNotification());
		}
		
	}
	
	public void attach(IObserver observer){
		observerList.add(observer);
	}
	
	public void detach(IObserver observer){
		observerList.remove(observer);
	}
	

}
