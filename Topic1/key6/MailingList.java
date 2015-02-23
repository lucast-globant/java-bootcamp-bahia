package Topic1.key6;

import java.util.ArrayList;
import java.util.List;


public class MailingList {
	
	private List<IObserver> observerList= new ArrayList<IObserver>();
	private String notification;
	
	public String getNotification() {
		return notification;
	}
	
	public void notify(String notify) {
		this.notification = notify;
		notifyChanged();		
	}
	
	private void notifyChanged() {
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
