package Topic_1.ShoppingCart.Domain.Exceptions;

import Topic_1.ShoppingCart.Domain.PaymentMethods.IPaymentMethod;

/**
 * Raises when a payment fails
 */
public class InvalidPaymentDataException extends IllegalArgumentException {

	private IPaymentMethod paymentType;

	public InvalidPaymentDataException(IPaymentMethod paymentType) {
		this.paymentType = paymentType;
	}

	@Override public String toString() {
		return "Payment Failed. Invalid data. Payment type: " + paymentType.toString();
	}
}
