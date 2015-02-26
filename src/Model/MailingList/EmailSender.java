package Model.MailingList;

import java.util.ArrayList;
import java.util.List;

//Subject
public class EmailSender {
	
	private List<IObserver> mailingList;
	private String notification;
	private static EmailSender instance = null;
	
	private EmailSender() {
		mailingList= new ArrayList<IObserver>();
		notification="";
	}

	public static EmailSender getInstance() {
		if (instance == null) {
			instance = new EmailSender();
		}
		return instance;
	}
	
	public void notifyToList(String notify) {
		this.notification = notify;
		notifyChanged();		
	}
	
	public void attachToList(IObserver observer){
		mailingList.add(observer);
	}
	
	public void detachFromList(IObserver observer){
		mailingList.remove(observer);
	}

	private String getNotification() {
		return notification;
	}
	
	private void notifyChanged() {
		for (IObserver iObserver : mailingList) {
			iObserver.update(getNotification());
		}
		
	}
	

}
