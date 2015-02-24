package Topic_1.ShoppingCart.Domain.Discounts.Types;

import Topic_1.ShoppingCart.Domain.Entities.Cart;
import Topic_1.ShoppingCart.Domain.Discounts.DiscountInfo;
import Topic_1.ShoppingCart.Domain.Discounts.DiscountTypes;
import Topic_1.ShoppingCart.Domain.Discounts.IDiscount;
import Topic_1.ShoppingCart.Domain.PaymentMethods.IPaymentMethod;

/**
 * Defines the discount applied when paying by credit card
 */
public class CreditCardDiscount implements IDiscount {

	@Override public Cart applyDiscount(Cart cart, IPaymentMethod paymentType) {

		// Get 10% discount
		DiscountInfo discount = new DiscountInfo("10% OFF for paying with Credit Card!",
				DiscountTypes.tenPercentDiscount());

		// Apply discount to the cart amount
		cart.getAmount().setDiscountInfo(discount);

		return cart;
	}
}
