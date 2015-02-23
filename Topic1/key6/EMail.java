package Topic1.key6;

import java.util.ArrayList;
import java.util.List;

public class EMail implements IObserver{
	private String direction;
	private List<String> notifications;

		
	public EMail() {
		direction="manager@myemailbox.com";
		this.notifications = new ArrayList<String>();
	}



	public List<String> getNotifications() {
		return notifications;
	}



	public void setNotifications(ArrayList<String> notifications) {
		this.notifications = notifications;
	}



	public void update(String notification){
		notifications.add(notification);
		System.out.println("New email received: "+notification);
	}



}
