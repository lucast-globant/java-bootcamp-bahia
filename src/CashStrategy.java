import java.util.Calendar;

public class CashStrategy implements PaymentStrategy {

	private int counter;
    private Calendar calendar;

    public CashStrategy(){
    	calendar = Calendar.getInstance();
    }

    public void pay(double amount, int c, MailList mailList) {
        System.out.println("Paid by Cash: " + amount);
        counter=c;
        mailList.addNotification(new Notification("Martin",calendar.getTime(),"The user Martin has paid in cash"));
    }
    
    public String getType(){
    	return "Cash";
    }

}