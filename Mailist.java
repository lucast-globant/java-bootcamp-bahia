package topic1.mailist;

import java.util.ArrayList;
import java.util.List;


public class Mailist {
	
	private List <Notification> list;
	private String emailAdress;
	
	public Mailist (String email) {
		list = new ArrayList <Notification> ();
		emailAdress = email;
	}

	public void addNotification (Notification m) {
		list.add(m);
	}
	
	public void removeNotification (Notification m) {
		list.remove(m);
	}
	
	public List <Notification> showList () {
		return list;
	}
	
	public String toString () {
		String str = "For: "+emailAdress+"\nContent mail list: \n"; 
		if (list.isEmpty()) {
			str+="no notifications."; 
		}
		else { 
			for (Notification n: list) {
				str+= "Subject: "+n.getSubject()+"\nBody Message: "+n.getBodyMessage()+"\n";
			}
		}
		return str;
	}
}
