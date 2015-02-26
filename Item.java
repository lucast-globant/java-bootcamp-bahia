package topic1;

import topic1.mailist.Notification;

public class Item {
	
	private int cod;
	private String description;
	private double price;
	
	public Item(int cod, String description, double price) {
		super();
		this.cod = cod;
		this.description = description;
		this.price = price;
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

	public Notification setPrice(double price) {
		String itemInfo = this.toString();
		this.price = price;
		return new Notification ("Price changed",itemInfo);		
	}
	
	public String itemString () {
		return "Item "+description+" ...... Price $"+price;		
	}

	@Override
	public String toString() {
		return "Product [cod=" + cod + ", description=" + description
				+ ", price=" + price + "]";
	}
	
}
