import java.util.Calendar;


public class PaypalStrategy implements PaymentStrategy {

    private String email;
    private String password;
    private int counter;
    private Calendar calendar;

    public PaypalStrategy(String email, String password){
        this.email=email;
        this.password=password;
        calendar = Calendar.getInstance();
    }

    public void pay(double amount, int c, MailList mailList) {
        System.out.println("Paid by Paypal: " + amount);
        counter=c;
        mailList.addNotification(new Notification("Martin",calendar.getTime(),"The user "+email+" has paid by paypal"));
    }
    
    public String getType(){
    	return "Paypal";
    }

    
}