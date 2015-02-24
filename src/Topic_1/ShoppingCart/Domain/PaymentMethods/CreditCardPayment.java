package Topic_1.ShoppingCart.Domain.PaymentMethods;

public class CreditCardPayment implements IPaymentMethod {

	private String name;
	private String creditCardNumber;

	public CreditCardPayment(String name, String creditCardNumber) {
		this.name = name;
		this.creditCardNumber = creditCardNumber;
	}

	@Override public boolean pay() {
		return true;
	}
}
