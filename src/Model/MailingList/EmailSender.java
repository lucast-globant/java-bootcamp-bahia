package model.mailingList;

import java.util.ArrayList;
import java.util.List;


public class EmailSender {
	
	private List<String> listOfMailAdresses;
	private String notification;
	private static EmailSender instance = null;
	
	private EmailSender() {
		listOfMailAdresses= new ArrayList<String>();
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
	
	public void attachToList(String mailAdress){
		listOfMailAdresses.add(mailAdress);
	}
	
	public void detachFromList(String mailAdress){
		listOfMailAdresses.remove(mailAdress);
	}

	private String getNotification() {
		return notification;
	}
	
	private void notifyChanged() {
		for (String mail : listOfMailAdresses) {
			System.out.println(mail+" received: "+notification);
		}
		
	}
	

}
