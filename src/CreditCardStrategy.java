import java.util.Calendar;

public class CreditCardStrategy implements PaymentStrategy {

	//DECLARATIONS
    private String name;
    private String creditcardNumber;
    private int counter;
    private Calendar calendar;

    //PROCEDURES
    public CreditCardStrategy(String name, String creditcardNumber){
        this.name=name;
        this.creditcardNumber=creditcardNumber;
        calendar = Calendar.getInstance();
    }

    public void pay(double amount, int c, MailList mailList) {
        System.out.println("Paid by credit card: " + amount);
        counter=c;
        mailList.addNotification(new Notification("Martin",calendar.getTime(),"The user "+name+" has paid by credit card"));
    }

    public String getType(){
    	return "CreditCard";
    }
    
}