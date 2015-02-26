
public interface PaymentStrategy {

    public void pay(double amount, int counter,MailList mailList);
    public String getType();

}
