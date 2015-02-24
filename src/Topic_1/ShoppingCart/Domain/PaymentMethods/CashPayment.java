package Topic_1.ShoppingCart.Domain.PaymentMethods;

public class CashPayment implements IPaymentMethod {

	@Override public boolean pay() {
		return true;
	}
}
