import java.util.Calendar;

public class CashStrategy implements PaymentStrategy {

	private int counter;
	private MailList mailList;
    private Calendar calendar;

    public CashStrategy(MailList mailList){
    	this.mailList=mailList;
    	calendar = Calendar.getInstance();
    }

    public void pay(double amount, int c) {
        System.out.println("Paid by Cash: " + amount);
        counter=c;
        mailList.addNotification(new Notification("Martin",calendar.getTime(),"The user Martin has paid in cash"));
    }
    
    public String getType(){
    	return "Cash";
    }

}