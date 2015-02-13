package Topic1.key6;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IObserver{
	private List<Notification> notifications;

		
	public Manager() {
		
		this.notifications = new ArrayList<Notification>();
	}



	public List<Notification> getNotifications() {
		return notifications;
	}



	public void setNotifications(ArrayList<Notification> notifications) {
		this.notifications = notifications;
	}



	public void update(Notification state){
		notifications.add(state);
		System.out.println("Observer has recieved update signal with new "+state.getMessage());
	}
	
}
