package topic1;

import topic1.notifications.Mail;
import topic1.notifications.Observable;
import topic1.notifications.Observer;
import topic1.notifications.Subject;

public class Item implements Subject { 
	
	private int cod;
	private String description;
	private double price;
	
	public Item (int cod, String description, double price) {
		super();
		this.cod = cod;
		this.description = description;
		this.price = price;
		doNotify(new Mail ("manager@mail.com","New Item",this.toString()));
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		doNotify(new Mail ("manager@mail.com","Item's price changed",this.toString()+"\nThe new price is "+price));
		this.price = price;
	}
	
	public String itemString () {
		return "Item "+description+" ...... Price $"+price;		
	}

	public String toString() {
		return "Product [cod=" + cod + ", description=" + description
				+ ", price=" + price + "]";
	}

	public void addObserver(Observer o) {
		Observable.getItemObservers().add(o);
	}

	public void removeObserver(Observer o) {
		Observable.getItemObservers().remove(o);		
	}

	public void doNotify(Mail mail) {
		for (Observer o: Observable.getItemObservers()) {
			if (o != null) {
				o.update(mail);
			}
		}
	}
	
}
