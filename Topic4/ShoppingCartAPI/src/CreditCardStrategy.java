import java.util.Calendar;

public class CreditCardStrategy implements PaymentStrategy {

	//DECLARATIONS
    private String name;
    private String creditcardNumber;
    private int counter;
    private MailList mailList;
    private Calendar calendar;

    //PROCEDURES
    public CreditCardStrategy(String name, String creditcardNumber, MailList mailList){
        this.name=name;
        this.creditcardNumber=creditcardNumber;
        this.mailList=mailList;
        calendar = Calendar.getInstance();
    }

    public void pay(double amount, int c) {
        System.out.println("Paid by credit card: " + amount);
        counter=c;
        mailList.addNotification(new Notification("Martin",calendar.getTime(),"The user "+name+" has paid by credit card"));
    }

    public String getType(){
    	return "CreditCard";
    }
    
}