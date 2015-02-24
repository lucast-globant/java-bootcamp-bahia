package Topic_1.ShoppingCart.Domain.Discounts;

import Topic_1.ShoppingCart.Domain.Entities.Cart;
import Topic_1.ShoppingCart.Domain.PaymentMethods.IPaymentMethod;

public interface IDiscount {

	public Cart applyDiscount(Cart cart, IPaymentMethod paymentType);
}
