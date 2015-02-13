import java.util.Calendar;


public class PaypalStrategy implements PaymentStrategy {

    private String email;
    private String password;
    private int counter;
    private MailList mailList;
    private Calendar calendar;

    public PaypalStrategy(String email, String password, MailList mailList){
        this.email=email;
        this.password=password;
        this.mailList=mailList;
        calendar = Calendar.getInstance();
    }

    public void pay(double amount, int c) {
        System.out.println("Paid by Paypal: " + amount);
        counter=c;
        mailList.addNotification(new Notification("Martin",calendar.getTime(),"The user "+email+" has paid by paypal"));
    }
    
    public String getType(){
    	return "Paypal";
    }

    
}