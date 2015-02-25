
public interface PaymentStrategy {

    public void pay(double amount, int counter);
    public String getType();

}
