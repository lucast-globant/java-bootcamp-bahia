import java.util.Calendar;

public class Item {

	//DECLARATIONS
	private String name;
	private double price;
	MailList mailList;
	Calendar calendar;
	
	
	//PROCEDURES
	public Item(String name, double cost, MailList mailList){
		this.name=name;
		this.price=cost;
		this.mailList=mailList;
		calendar= Calendar.getInstance();
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void changPrice(double newPrice){
		price=newPrice;
		mailList.addNotification(new Notification("Admin",calendar.getTime(),"The price of "+name+" has been changed to "+price));
	}

}