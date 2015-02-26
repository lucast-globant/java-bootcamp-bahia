package Model.MailingList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jordan
 * responsibility: save income messages, keep a identifier about it (email direction)
 */
public class EMailAccount implements IObserver{
	private String direction;
	private String password;
	private List<String> inbox;

		
	public EMailAccount() {
		direction="manager@myemailbox.com";
		this.inbox = new ArrayList<String>();
	}

	public List<String> getMessages() {
		return inbox;
	}

	/* 
	 * save the income message and alert you about
	 */
	public void update(String notification){
		inbox.add(notification);
		System.out.println("New email received: "+notification);
	}



}
