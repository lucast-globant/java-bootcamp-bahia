package topic1.offer;

import topic1.notifications.Subject;

public abstract class Offer implements Subject {
	
	protected String name; 
	
	public Offer (String name) {
		this.name = name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
}
