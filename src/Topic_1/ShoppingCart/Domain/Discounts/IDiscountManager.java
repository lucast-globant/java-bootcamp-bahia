package Topic_1.ShoppingCart.Domain.Discounts;

import Topic_1.ShoppingCart.Domain.PaymentMethods.IPaymentMethod;

public interface IDiscountManager {

	public IDiscount getDiscount(IPaymentMethod paymentMethod);
}
